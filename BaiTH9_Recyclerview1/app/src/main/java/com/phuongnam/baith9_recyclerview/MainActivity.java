package com.phuongnam.baith9_recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewData;
    RecyclerView recyclerViewLandscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewData = new ArrayList<>();
        recyclerViewData.add(new LandScape("hanoi", "Thủ đô Hà Nội"));
        recyclerViewData.add(new LandScape("hue", "Cố đô Huế"));
        recyclerViewData.add(new LandScape("nhatrang", "Thành phố Nha Trang"));
        recyclerViewData.add(new LandScape("saigon", "Thành phố Hồ Chí Minh"));
        recyclerViewData.add(new LandScape("bingham", "Cung điện Buckingham"));

        recyclerViewLandscape = findViewById(R.id.rvLand);
        recyclerViewLandscape.setLayoutManager(new LinearLayoutManager(this));

        landScapeAdapter = new LandScapeAdapter(this, recyclerViewData);
        recyclerViewLandscape.setAdapter(landScapeAdapter);
    }
}