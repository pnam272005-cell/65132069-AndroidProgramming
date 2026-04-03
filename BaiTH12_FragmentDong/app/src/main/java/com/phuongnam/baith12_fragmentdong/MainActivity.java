package com.phuongnam.baith12_fragmentdong;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Gọi người quản lý Fragment
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Viết gộp chuỗi lệnh thêm Fragment
        fragmentManager.beginTransaction()
                .add(R.id.frameContent, new ContentFragment()) // Thay frameContent bằng frameContentHoder
                .add(R.id.frameFooter, new FooterFragment())// Thay frameFooter bằng frameFooterHoder
                .commit();
    }

}