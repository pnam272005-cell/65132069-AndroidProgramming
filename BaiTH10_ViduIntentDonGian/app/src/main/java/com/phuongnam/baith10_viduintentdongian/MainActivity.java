package com.phuongnam.baith10_viduintentdongian;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Hàm đáp ứng sự kiện nhấn lên nút "Sang màn hình khác" [cite: 214]
    public void ChuyenManHinh(View v) {
        // Tạo một đối tượng Intent [cite: 216]
        // Tham số thứ 2 là tên Activity ta muốn chuyển sang [cite: 217]
        Intent iManHinhKhac = new Intent(this, SubActivityOne.class);
        // Thực hiện chuyển [cite: 218]
        startActivity(iManHinhKhac);
    }
}