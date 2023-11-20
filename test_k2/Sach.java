/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_k2;

/**
 *
 * @author ADMIN
 */
public class Sach extends TaiLieu implements ITaiLieu{
    private String tenSach ;
    private String tenTG ;
    private int soTrang ;

    public Sach() {
    }

    public Sach(String tenSach, String tenTG, String tenNhaXB, int soTrang, int soBanPH) {
        super(tenNhaXB, soBanPH);
        this.tenSach = tenSach;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    public String chuanHoa(){
        String [] s = getTenTG().toUpperCase().split("\\s+");
        String res = s[s.length - 1];
        return res;
    }
    public void setMa(){
        super.setMa();
        //ma = chuanHoa() + getMa();
        super.setMa(chuanHoa()+super.getMa());
    }
    
    @Override
    public int SoAnPham() {
        int x;
        if(getSoBanPH()<=200) x=(int) (0.05*getSoBanPH());
        else if(getSoBanPH()<=500) x=(int) (0.08*getSoBanPH());
        else x=(int) (0.1*getSoBanPH());
        if(getTenNhaXB().equalsIgnoreCase("giao duc")) x=(int) (x-0.02*x);
        return x;
    }
  
    public String toString() {
        return getMa()+" "+getTenSach()+" "+getTenTG()+" "+getTenNhaXB()+" "+getSoBanPH() ;
    }

}
