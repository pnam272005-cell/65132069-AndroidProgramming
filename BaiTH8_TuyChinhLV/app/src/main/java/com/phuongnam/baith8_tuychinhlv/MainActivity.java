package com.phuongnam.baith8_tuychinhlv;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvDanhSachMonAn;
    ArrayList<MonAn> danhSachMonAn;
    MonAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDanhSachMonAn = findViewById(R.id.lvDanhSachMonAn);

        danhSachMonAn = new ArrayList<>();
        danhSachMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Cơm tấm sườn nướng siêu ngon", R.drawable.com_suon));
        danhSachMonAn.add(new MonAn("Cơm sườn trứng", 30000, "Có thêm trứng ốp la", R.drawable.com_suon_trung));
        danhSachMonAn.add(new MonAn("Cơm gà xối mỡ", 38000, "Gà ta giòn rụm", R.drawable.com_ga));
        danhSachMonAn.add(new MonAn("Cơm đặc biệt", 45000, "Đầy đủ topping", R.drawable.com_dac_biet));

        adapter = new MonAnAdapter(MainActivity.this, danhSachMonAn);
        lvDanhSachMonAn.setAdapter(adapter);

        lvDanhSachMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MonAn monDuocChon = danhSachMonAn.get(i);
                Toast.makeText(MainActivity.this, "Bạn chọn: " + monDuocChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}