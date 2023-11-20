/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2;

/**
 *
 * @author ADMIN
 */
public class XeTai extends PTGT implements IPTGT{
    private double trongTai;
    private boolean thung;

    public XeTai() {
    }

    public XeTai(String hang, String ngayLanBanh, double giaGoc, double trongTai, boolean thung) {
        super(hang, ngayLanBanh, giaGoc);
        this.trongTai = trongTai;
        this.thung = thung;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public boolean isThung() {
        return thung;
    }

    public void setThung(boolean thung) {
        this.thung = thung;
    }
    public void setMa(){
//        String ma = "T-" + String.format("%03d", PTGT.getMaTMP(ma));
          String ma = "T-" + String.format("%03d", PTGT.getMaTMP());
        super.setMa(ma);
    }

    /**
     *
     * @return
     */

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
        if(thung){
            giaBan += giaBan*0.1;
        }
        return giaBan;
    }
    @Override
    public String toString() {
        return  super.getMa() + " " + super.getHang() + " " + super.getNgayLanBanh()  + " " + trongTai +  " " + (int)getGiaBan();
    }
    
    
}
