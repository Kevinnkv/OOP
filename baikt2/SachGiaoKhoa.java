/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baikt2;

/**
 *
 * @author ADMIN
 */
public class SachGiaoKhoa extends SachHoc implements ISach {

    private int lop, tap;
    private boolean baitap;

    public SachGiaoKhoa(String ten, String nhaXB, int lop, int tap, boolean baitap, double gia) {
        super(ten, nhaXB, gia);
        this.lop = lop;
        this.tap = tap;
        this.baitap = baitap;
    }

    SachGiaoKhoa(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public int getTap() {
        return tap;
    }

    public void setTap(int tap) {
        this.tap = tap;
    }

    public boolean isBaitap() {
        return baitap;
    }

    public void setBaitap(boolean baitap) {
        this.baitap = baitap;
    }

    public void setMa() {
        super.setMa();
        super.setMa("SGK" + lop + tap + super.getMa());
    }

    @Override
    public double getThanhTien() {
        double x = 0;
        if (lop >= 1 && lop <= 5) {
            x = getGia() - getGia() * 0.1;
        }
        if (lop >= 6 && lop <= 9) {
            x = getGia() - getGia() * 0.05;
        }
        if (baitap) {
            x = x + x * 0.05;
        }
        return x;
    }

    public String toString() {
        String x;
        if (baitap) {
            x = "bai tap";
        } else {
            x = "ly thuyet";
        }
        return getMa() + " " + getTen() + " " + getNhaXB() + " " + getLop() + " " + tap + " " + x + " " + (int) getThanhTien();
    }
}

