/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2;

/**
 *
 * @author ADMIN
 */
public class PTGT {
    private String ma;
    private String hang;
    private String ngayLanBanh;
    private double giaGoc;
    private static int maTMP = 0;

    
    public PTGT() {
    }

    public PTGT(String hang, String ngayLanBanh, double giaGoc) {
        this.hang = hang;
        this.ngayLanBanh = ngayLanBanh;
        this.giaGoc = giaGoc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    public static int getMaTMP() {
        return ++maTMP;
    }

    public static void setMaTMP(int maTMP) {
        PTGT.maTMP = maTMP;
    }
    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNgayLanBanh() {
        return ngayLanBanh;
    }

    public void setNgayLanBanh(String ngayLanBanh) {
        this.ngayLanBanh = ngayLanBanh;
    }

    public double getGiaGoc() {
        return giaGoc;
    }

    public void setGiaGoc(double giaGoc) {
        this.giaGoc = giaGoc;
    }
    
}
