/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baikt2;

/**
 *
 * @author ADMIN
 */
public class SachThamKhao extends SachHoc implements ISach{
    private boolean loai;

    public SachThamKhao(String ten,String nhaXB,boolean loai,double gia) {
        super(ten,nhaXB,gia);
        this.loai = loai;
    }

    SachThamKhao(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isLoai() {
        return loai;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }
    public void setMa(){
        String [] s=getNhaXB().toUpperCase().split("\\s+");
        String res="";
        for(String i: s){
            res+=i.charAt(0);
        }
        super.setMa();
        super.setMa(res+super.getMa());
    }

    @Override
    public double getThanhTien() {
        if(loai) return getGia()+getGia()*0.1;
        else return getGia()+getGia()*0.15;
        
    }
    public String toString(){
        String x;
        if(loai) x="co ban";
        else x="nang cao";
        return getMa()+" "+getTen()+" "+getNhaXB()+" "+x+" "+(int)getThanhTien();
    }
}

