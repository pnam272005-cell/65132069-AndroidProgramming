package com.phuongnam.viewpager2tablayoutfragment;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<QuocGia> dsQuocGia;
    QuocGiaPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View mainView = findViewById(R.id.mainLayout);
        ViewCompat.setOnApplyWindowInsetsListener(mainView, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 1. Khởi tạo danh sách dữ liệu
        dsQuocGia = new ArrayList<>();
        dsQuocGia.add(new QuocGia("United State", 80000000, R.drawable.united_state));
        dsQuocGia.add(new QuocGia("Việt Nam", 3333333, R.drawable.vietam));
        dsQuocGia.add(new QuocGia("Nhật Bản", 6663333, R.drawable.nhatban));
        dsQuocGia.add(new QuocGia("Spain", 47000000, R.drawable.spain));
        dsQuocGia.add(new QuocGia("Brazil", 214000000, R.drawable.brazil));

        // 2. Ánh xạ View
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 viewPager2 = findViewById(R.id.viewPager2);

        // 3. Thiết lập Adapter
        adapter = new QuocGiaPagerAdapter(this, dsQuocGia);
        viewPager2.setAdapter(adapter);

        // 4. Kết nối TabLayout với ViewPager2 (Hiển thị tên QG1, QG2...)
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            tab.setText("QG" + (position + 1));
        }).attach();
    }
}