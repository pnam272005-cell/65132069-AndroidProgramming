package com.phuongnam.thigk2nguyenphuongnam;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1, container, false);
        EditText e1 = v.findViewById(R.id.edtTienVND);
        EditText e2 = v.findViewById(R.id.edtTiGia);
        Button btn = v.findViewById(R.id.btnDoiTien);
        TextView tv = v.findViewById(R.id.tvKetQua);

        btn.setOnClickListener(view -> {
            try {
                double vnd = Double.parseDouble(e1.getText().toString());
                double ti = Double.parseDouble(e2.getText().toString());
                tv.setText("Kết quả: " + (vnd / ti) + " USD");
            } catch (Exception e) {
                tv.setText("Lỗi nhập liệu");
            }
        });
        return v;
    }
}