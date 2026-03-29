package com.phuongnam.sudungdrawbleresource;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Button btnCong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ nút CỘNG từ giao diện
        btnCong = findViewById(R.id.btnCong);

        // Lắng nghe sự kiện click vào nút CỘNG
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("VNEXPRESS", "Đang tải dữ liệu...");
                docDuLieuRSS();
            }
        });
    }

    private void docDuLieuRSS() {
        // BẮT BUỘC: Phải tạo một luồng (Thread) riêng để tải mạng
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL("https://vnexpress.net/rss/giao-duc.rss");
                    InputStream inputStream = url.openStream();

                    // Dùng XmlPullParser của Android thay cho thư viện Java thuần
                    XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
                    XmlPullParser parser = factory.newPullParser();
                    parser.setInput(inputStream, "UTF-8");

                    boolean isInsideItem = false;
                    int eventType = parser.getEventType();

                    while (eventType != XmlPullParser.END_DOCUMENT) {
                        String tagName = parser.getName();

                        if (eventType == XmlPullParser.START_TAG) {
                            // 1. Kiểm tra xem có bắt đầu vào một tin mới hay không
                            if ("item".equals(tagName)) {
                                isInsideItem = true;
                                Log.d("VNEXPRESS", "\n------------------------------");
                            }

                            // 2. Nếu đang ở trong một item, mới tiến hành lấy dữ liệu chi tiết
                            if (isInsideItem) {
                                if ("title".equals(tagName)) {
                                    Log.d("VNEXPRESS", "Tiêu đề: " + parser.nextText());
                                } else if ("link".equals(tagName)) {
                                    Log.d("VNEXPRESS", "Link: " + parser.nextText());
                                } else if ("pubDate".equals(tagName)) {
                                    Log.d("VNEXPRESS", "Ngày đăng: " + parser.nextText());
                                } else if ("description".equals(tagName)) {
                                    String desc = parser.nextText();

                                    // Y CHANG LOGIC CỦA THẦY: Tìm vị trí của src="
                                    String imgUrl = "";
                                    if (desc.contains("src=\"")) {
                                        int start = desc.indexOf("src=\"") + 5;
                                        int end = desc.indexOf("\"", start);
                                        imgUrl = desc.substring(start, end);
                                        int vitriDauHoi = imgUrl.indexOf("?");
                                        if (vitriDauHoi > 0) {
                                            imgUrl = imgUrl.substring(0, vitriDauHoi);
                                        }
                                    }

                                    // Y CHANG LOGIC CỦA THẦY: Lấy phần text sau thẻ </br>
                                    String summary = "";
                                    int lastBr = desc.lastIndexOf("</br>");
                                    if (lastBr != -1) {
                                        summary = desc.substring(lastBr + 5).trim();
                                    }

                                    Log.d("VNEXPRESS", "Ảnh minh họa: " + imgUrl);
                                    Log.d("VNEXPRESS", "Tóm tắt: " + summary);
                                }
                            }
                        }
                        // 3. Khi gặp thẻ đóng </item>, đánh dấu thoát khỏi tin hiện tại
                        else if (eventType == XmlPullParser.END_TAG && "item".equals(tagName)) {
                            isInsideItem = false;
                        }

                        eventType = parser.next();
                    }
                    inputStream.close();
                    Log.d("VNEXPRESS", "Tải xong!");

                } catch (Exception e) {
                    Log.e("VNEXPRESS", "Lỗi: " + e.getMessage());
                }
            }
        }).start(); // Đừng quên start() để luồng chạy
    }
}