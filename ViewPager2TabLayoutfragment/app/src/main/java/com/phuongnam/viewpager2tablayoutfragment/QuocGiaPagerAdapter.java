package com.phuongnam.viewpager2tablayoutfragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.ArrayList;

public class QuocGiaPagerAdapter extends FragmentStateAdapter {

    private ArrayList<QuocGia> dsQuocGia;

    // Adapter này nhận vào một danh sách (ArrayList) các quốc gia
    public QuocGiaPagerAdapter(@NonNull FragmentActivity fragmentActivity, ArrayList<QuocGia> dsQuocGia) {
        super(fragmentActivity);
        this.dsQuocGia = dsQuocGia;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Trả về Fragment tương ứng với Quốc gia đang được chọn
        QuocGia quocGiaHienTai = dsQuocGia.get(position);
        return new QuocGiaFragment(quocGiaHienTai);
    }

    @Override
    public int getItemCount() {
        return dsQuocGia.size();
    }
}