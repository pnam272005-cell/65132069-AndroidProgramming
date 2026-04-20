package com.phuongnam.thigk2nguyenphuongnam;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2, container, false);
        ListView lv = v.findViewById(R.id.lvSongs);
        String[] s = {"Nguyễn Phương Nam", "Tiến Quân Ca", "Lên Đàng", "Đoàn Vệ Quốc Quân", "Chào em cô gái Lam Hồng", "Bài ca hy vọng", "Dáng đứng Bến Tre", "Hát mãi khúc quân hành", "Năm anh em trên một chiếc xe tăng", "Cô gái mở đường"};
        lv.setAdapter(new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, s));
        return v;
    }
}