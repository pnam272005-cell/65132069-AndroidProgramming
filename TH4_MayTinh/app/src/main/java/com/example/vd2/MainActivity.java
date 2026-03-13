package com.example.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Khai báo các biến
    EditText edtSo1;
    EditText edtSo2;
    EditText edtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Nạp giao diện XML
        setContentView(R.layout.activity_main);

        // Gọi hàm ánh xạ để tìm các ô nhập liệu
        TimDieuKhien();
    }

    // Hàm ánh xạ ID
    public void TimDieuKhien() {
        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);
        edtKetQua = findViewById(R.id.edtKetQua);
    }

    // Xử lý phép CỘNG
    public void XuLyCong(View view) {
        double soA = Double.parseDouble(edtSo1.getText().toString());
        double soB = Double.parseDouble(edtSo2.getText().toString());
        double tong = soA + soB;
        edtKetQua.setText(String.valueOf(tong));
    }

    // Xử lý phép TRỪ
    public void XuLyTru(View view) {
        double soA = Double.parseDouble(edtSo1.getText().toString());
        double soB = Double.parseDouble(edtSo2.getText().toString());
        double hieu = soA - soB;
        edtKetQua.setText(String.valueOf(hieu));
    }

    // Xử lý phép NHÂN
    public void XuLyNhan(View view) {
        double soA = Double.parseDouble(edtSo1.getText().toString());
        double soB = Double.parseDouble(edtSo2.getText().toString());
        double tich = soA * soB;
        edtKetQua.setText(String.valueOf(tich));
    }

    // Xử lý phép CHIA
    public void XuLyChia(View view) {
        double soA = Double.parseDouble(edtSo1.getText().toString());
        double soB = Double.parseDouble(edtSo2.getText().toString());

        if (soB == 0) {
            edtKetQua.setText("Lỗi: Không thể chia cho 0");
        } else {
            double thuong = soA / soB;
            edtKetQua.setText(String.valueOf(thuong));
        }
    }
}