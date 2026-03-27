package com.phuongnam.viewpager2tablayoutfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.text.DecimalFormat;

public class QuocGiaFragment extends Fragment {

    private QuocGia quocGia;

    public QuocGiaFragment(QuocGia quocGia) {
        this.quocGia = quocGia;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quoc_gia, container, false);

        // 1. Ánh xạ các ID
        TextView tvTenQG = view.findViewById(R.id.tvTenQG);
        TextView tvDanSo = view.findViewById(R.id.tvDanSo);
        ImageView ivLaCo = view.findViewById(R.id.ivLaCo);

        // 2. Điền dữ liệu
        if (quocGia != null) {
            tvTenQG.setText(quocGia.getTenQuocGia());
            DecimalFormat formatter = new DecimalFormat("#,###");
            String formattedPop = formatter.format(quocGia.getDanSo());
            tvDanSo.setText("Population: " + formattedPop);
            ivLaCo.setImageResource(quocGia.getIdAnhLaCo());
        }

        return view;
    }
}