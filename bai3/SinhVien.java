package baitapvenha10.bai3;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private double diemLyThuyet;
    private double diemThucHanh;

    public SinhVien() {
    }

    public SinhVien(int maSV, String hoTen, double diemLyThuyet, double diemThucHanh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(double diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public double getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(double diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }
    public double diemTrungBinh(double diemLyThuyet,double diemThucHanh){
        return (diemLyThuyet+diemThucHanh)/2;
    }

    @Override
    public String toString() {
        double diemTrungBinh = diemTrungBinh(diemLyThuyet,diemThucHanh);
        return "SinhVien{" +
                "maSV=" + maSV +
                ", hoTen='" + hoTen + '\'' +
                ", diemLyThuyet=" + diemLyThuyet +
                ", diemThucHanh=" + diemThucHanh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }
}
