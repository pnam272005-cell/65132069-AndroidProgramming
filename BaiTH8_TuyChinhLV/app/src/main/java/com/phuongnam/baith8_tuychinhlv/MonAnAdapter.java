package com.phuongnam.baith8_tuychinhlv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<MonAn> danhSachMonAn;
    private LayoutInflater inflater;

    public MonAnAdapter(Context context, ArrayList<MonAn> danhSachMonAn) {
        this.context = context;
        this.danhSachMonAn = danhSachMonAn;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return danhSachMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return danhSachMonAn.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflater.inflate(R.layout.item_mon_an, null);
        }

        TextView tvTenMon = view.findViewById(R.id.tvTenMon);
        TextView tvDonGia = view.findViewById(R.id.tvDonGia);
        TextView tvMoTa = view.findViewById(R.id.tvMoTa);
        ImageView imgAnhDaiDien = view.findViewById(R.id.imgAnhDaiDien);

        MonAn monHienTai = danhSachMonAn.get(i);

        tvTenMon.setText(monHienTai.getTenMonAn());
        tvDonGia.setText("Giá: " + monHienTai.getDonGia() + " VNĐ");
        tvMoTa.setText(monHienTai.getMoTa());
        imgAnhDaiDien.setImageResource(monHienTai.getIdAnhMinhHoa());

        return view;
    }
}