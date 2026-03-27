package com.phuongnam.baith8_tuychinhlv;

public class MonAn {
    private String tenMonAn;
    private int donGia;
    private String moTa;
    private int idAnhMinhHoa;

    public MonAn(String tenMonAn, int donGia, String moTa, int idAnhMinhHoa) {
        this.tenMonAn = tenMonAn;
        this.donGia = donGia;
        this.moTa = moTa;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }

    public String getTenMonAn() { return tenMonAn; }
    public void setTenMonAn(String tenMonAn) { this.tenMonAn = tenMonAn; }

    public int getDonGia() { return donGia; }
    public void setDonGia(int donGia) { this.donGia = donGia; }

    public String getMoTa() { return moTa; }
    public void setMoTa(String moTa) { this.moTa = moTa; }

    public int getIdAnhMinhHoa() { return idAnhMinhHoa; }
    public void setIdAnhMinhHoa(int idAnhMinhHoa) { this.idAnhMinhHoa = idAnhMinhHoa; }
}