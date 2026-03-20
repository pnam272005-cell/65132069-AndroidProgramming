package com.phuongnam.baith6_xulysukien_tinhtong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Hàm xử lý khi bấm nút (OnClick từ XML)
    public void XuLyCong(View view) {
        // 1. Ánh xạ các điều khiển
        EditText dieuKhienA = findViewById(R.id.edtA);
        EditText dieuKhienB = findViewById(R.id.edtB);
        EditText dieuKhienKQ = findViewById(R.id.edtKQ);

        // 2. Lấy dữ liệu
        String strA = dieuKhienA.getText().toString();
        String strB = dieuKhienB.getText().toString();

        // 3. Ép kiểu và tính toán
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        int tong = so_A + so_B;

        // 4. Hiển thị kết quả
        dieuKhienKQ.setText(String.valueOf(tong));
    }
}