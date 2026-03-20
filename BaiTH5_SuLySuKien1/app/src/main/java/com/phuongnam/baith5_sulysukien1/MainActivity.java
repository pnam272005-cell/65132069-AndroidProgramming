package com.phuongnam.baith5_sulysukien1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 1. Khai báo các biến
    EditText edtSo1, edtSo2, edtKetQua;
    Button btnCong, btnTru, btnNhan, btnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. Tìm điều khiển
        TimDieuKhien();

        // 3. GẮN BỘ LẮNG NGHE ẨN DANH (Anonymous Listener) GIỐNG Y VIDEO
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyCong();
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTru();
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyNhan();
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyChia();
            }
        });
    }

    // Hàm ánh xạ ID
    public void TimDieuKhien() {
        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);
        edtKetQua = findViewById(R.id.edtKetQua);

        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
    }

    // --- CÁC HÀM XỬ LÝ (Dùng kiểu float ép kiểu từ chuỗi y như thầy giáo làm) ---

    public void XuLyCong() {
        String chuoi1 = edtSo1.getText().toString();
        String chuoi2 = edtSo2.getText().toString();
        float num1 = Float.parseFloat(chuoi1);
        float num2 = Float.parseFloat(chuoi2);

        float tong = num1 + num2;
        edtKetQua.setText(String.valueOf(tong));
    }

    public void XuLyTru() {
        String chuoi1 = edtSo1.getText().toString();
        String chuoi2 = edtSo2.getText().toString();
        float num1 = Float.parseFloat(chuoi1);
        float num2 = Float.parseFloat(chuoi2);

        float hieu = num1 - num2;
        edtKetQua.setText(String.valueOf(hieu));
    }

    public void XuLyNhan() {
        String chuoi1 = edtSo1.getText().toString();
        String chuoi2 = edtSo2.getText().toString();
        float num1 = Float.parseFloat(chuoi1);
        float num2 = Float.parseFloat(chuoi2);

        float tich = num1 * num2;
        edtKetQua.setText(String.valueOf(tich));
    }

    public void XuLyChia() {
        String chuoi1 = edtSo1.getText().toString();
        String chuoi2 = edtSo2.getText().toString();
        float num1 = Float.parseFloat(chuoi1);
        float num2 = Float.parseFloat(chuoi2);

        float thuong = num1 / num2;
        edtKetQua.setText(String.valueOf(thuong));
    }
}