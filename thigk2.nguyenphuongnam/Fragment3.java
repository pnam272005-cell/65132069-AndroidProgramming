package com.phuongnam.thigk2nguyenphuongnam;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;

public class Fragment3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_3, container, false);
        ListView lv = v.findViewById(R.id.lvDanhNhan);
        ArrayList<HashMap<String, String>> l = new ArrayList<>();
        String[] n = {"Hồ Chí Minh", "Võ Nguyên Giáp", "Trần Hưng Đạo", "Quang Trung", "Hai Bà Trưng"};
        String[] q = {"Nghệ An", "Quảng Bình", "Nam Định", "Bình Định", "Hà Nội"};
        for (int i = 0; i < 5; i++) {
            HashMap<String, String> m = new HashMap<>();
            m.put("t", n[i]);
            m.put("q", q[i]);
            m.put("i", String.valueOf(android.R.drawable.ic_menu_myplaces));
            l.add(m);
        }
        lv.setAdapter(new SimpleAdapter(requireContext(), l, R.layout.item_danhnhan, new String[]{"t", "q", "i"}, new int[]{R.id.tvTen, R.id.tvQue, R.id.imgAvatar}));
        return v;
    }
}