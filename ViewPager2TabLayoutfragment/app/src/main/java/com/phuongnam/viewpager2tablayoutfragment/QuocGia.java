package com.phuongnam.viewpager2tablayoutfragment;

public class QuocGia {
    private String tenQuocGia;
    private int danSo;
    private int idAnhLaCo;
    public QuocGia(String tenQuocGia, int danSo, int idAnhLaCo) {
        this.tenQuocGia = tenQuocGia;
        this.danSo = danSo;
        this.idAnhLaCo = idAnhLaCo;
    }

    public String getTenQuocGia() { return tenQuocGia; }
    public int getDanSo() { return danSo; }
    public int getIdAnhLaCo() { return idAnhLaCo; }
}