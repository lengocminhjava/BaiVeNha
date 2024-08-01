package baitapvenha10.bai3;

public class SinhVienDetail {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.setHoTen("Lê Minh");
        sv1.setMaSV(1);
        sv1.setDiemThucHanh(10);
        sv1.setDiemLyThuyet(10);
        SinhVien sv2 = new SinhVien();
        sv2.setHoTen("Nguyễn Đức");
        sv2.setMaSV(2);
        sv2.setDiemThucHanh(9);
        sv2.setDiemLyThuyet(9);
        SinhVien sv3 = new SinhVien();
        sv3.setHoTen("Nguyễn Trường");
        sv3.setMaSV(3);
        sv3.setDiemThucHanh(9);
        sv3.setDiemLyThuyet(9);
        SinhVien[] svArray = {sv1,sv2,sv3};
      for(SinhVien sv:svArray){
          System.out.println(sv);
      }
    }
}
