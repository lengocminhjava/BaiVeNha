package baitapvenha10;

public class Rectangle {
   private float chieuDai;
   private float chieuRong;
    public Rectangle() {
    }
    public Rectangle(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public float getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }
    public float getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
    public float dienTich(float chieuDai,float ChieuRong){
        return chieuDai*chieuRong;
    }
    public float chuVi(float chieuDai,float ChieuRong){
        return chieuDai*chieuRong;
    }
}
