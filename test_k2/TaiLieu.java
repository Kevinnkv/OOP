/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_k2;

/**
 *
 * @author ADMIN
 */
public class TaiLieu {
    private String ma;
    private String tenNhaXB;
    private int soBanPH;
    private int soAnPham;
    
    private static double maTMP = 0;
    public TaiLieu() {
    }

    public TaiLieu(String tenNhaXB, int soBanPH) {
        this.tenNhaXB = tenNhaXB;
        this.soBanPH = soBanPH;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    public void setMa(){
        ma = String.format("%03d", ++maTMP);
    }
    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }

    public int getSoAnPham() {
        return soAnPham;
    }

    public void setSoAnPham(int soAnPham) {
        this.soAnPham = soAnPham;
    }
    
}
