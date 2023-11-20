/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2;

/**
 *
 * @author ADMIN
 */
public class Oto extends PTGT implements IPTGT{
    private int soCho; 
    private double dongCo; 

    public Oto() {
    }

    public Oto(String hang, String ngayLanBanh, double giaGoc, int soCho, double dongCo){
        super(hang, ngayLanBanh, giaGoc);
        this.soCho = soCho;
        this.dongCo = dongCo;
    }



    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public double getDongCo() {
        return dongCo;
    }

    public void setDongCo(double dongCo) {
        this.dongCo = dongCo;
    }
    public void setMa(){
        
        String ma = super.getHang().substring(0,2) + "-" + String.format("%03d", PTGT.getMaTMP());
        super.setMa(ma); 
         
    }
//    @Override
//    public String toString() {
//        return "Oto{" + "soCho=" + soCho + ", dongCo=" + dongCo + '}';
//    }

    @Override
    public double getGiaBan() {
        int nam = 2023 - Integer.parseInt(super.getNgayLanBanh().substring(3));
        double giaBan = 0;
        if(nam == 0){
            giaBan = super.getGiaGoc() + super.getGiaGoc()*0.1;
        }else if(nam >= 1 && nam <= 2){
            giaBan = super.getGiaGoc() - super.getGiaGoc()*0.1;
        }else if(nam >= 3 && nam <= 5){
            giaBan = super.getGiaGoc() - super.getGiaGoc()*0.2;
        }else if(nam > 5){
            giaBan = super.getGiaGoc() - super.getGiaGoc()*0.3;
        }
        return giaBan;
    }
    public String toString() {
        return  super.getMa() + " " + super.getHang() + " " + super.getNgayLanBanh()  + " " + soCho +  " " + (int)getGiaBan();
    }
}
