package com.example.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Hàm xử lý khi bấm nút TÍNH TỔNG
    public void XuLyCong(View view) {
        // 1. Ánh xạ các điều khiển từ giao diện XML sang Java
        EditText edtA = findViewById(R.id.edtA);
        EditText edtB = findViewById(R.id.edtB);
        EditText edtKQ = findViewById(R.id.edtKQ);

        // 2. Lấy dữ liệu người dùng nhập vào (ở dạng chuỗi)
        String strA = edtA.getText().toString();
        String strB = edtB.getText().toString();

        // 3. Ép kiểu dữ liệu từ chuỗi sang số nguyên để tính toán
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);

        // 4. Thực hiện phép tính
        int tong = so_A + so_B;

        // 5. Đổi kết quả dạng số về lại dạng chuỗi và in ra màn hình
        String strTong = String.valueOf(tong);
        edtKQ.setText(strTong);
    }
}