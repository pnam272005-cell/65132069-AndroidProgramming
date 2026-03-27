package com.phuongnam.baith7_listview1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> danhSachTenTinhThanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        danhSachTenTinhThanh = new ArrayList<>();
        danhSachTenTinhThanh.add("Hà Nội");
        danhSachTenTinhThanh.add("Hồ Chí Minh");
        danhSachTenTinhThanh.add("Đồng Nai");
        danhSachTenTinhThanh.add("Bình Thuận");
        danhSachTenTinhThanh.add("Ninh Thuận");
        danhSachTenTinhThanh.add("Nha Trang");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                danhSachTenTinhThanh
        );

        ListView listViewTinhThanh = findViewById(R.id.listViewTinhThanh);
        listViewTinhThanh.setAdapter(adapter);

        AdapterView.OnItemClickListener boLangNghe = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String tenTinh = danhSachTenTinhThanh.get(i);
                String thongBao = "Bạn vừa chọn " + tenTinh;
                Toast.makeText(MainActivity.this, thongBao, Toast.LENGTH_SHORT).show();
            }
        };

        listViewTinhThanh.setOnItemClickListener(boLangNghe);
    }
}