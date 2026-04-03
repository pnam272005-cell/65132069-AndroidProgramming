package com.phuongnam.baith10_viduintentdongian;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubActivityOne extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }

    // Hàm đáp ứng sự kiện nhấn lên nút "Quay về trang chủ"
    public void QuayVe(View v) {
        // Tạo một đối tượng Intent xử lý chuyển về màn hình trang chủ
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        // Thực hiện chuyển
        startActivity(iManHinhCHINH);
    }
}