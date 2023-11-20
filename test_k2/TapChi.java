/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_k2;

/**
 *
 * @author ADMIN
 */
public class TapChi extends TaiLieu implements ITaiLieu{
    private String thang;

    public TapChi() {
    }

    public TapChi(String tenNhaXB, int soBanPH, String thang) {
        super(tenNhaXB, soBanPH);
        this.thang = thang;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }
    public String tachTen(){
        String res = "";
        String [] s = getTenNhaXB().toUpperCase().split("\\s+");
        for(int i= 0;i< s.length;i++){
            res += s[i].charAt(0);
        }
        return res;
        
    }
    public void setMa(){
        String ma = tachTen() + getMa();
        super.setMa();
    }
    

    @Override
    public int getSoAnPham() {
        int x;
        if (getSoBanPH() <= 100) {
            x = (int) (0.02 * getSoBanPH());
        } else if (getSoBanPH() <= 200) {
            x = (int) (0.05 * getSoBanPH());
        } else {
            x = (int) (0.08 * getSoBanPH());
        }
        if (getTenNhaXB().equalsIgnoreCase("KHCNTT TT")) {
            x = (int) (x + x * 0.02);
        }
        return x;
    }
    @Override
    public String toString() {
        return getMa()+" "+getTenNhaXB()+" "+getSoBanPH()+" "+getThang();
    }
    
}
