/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baikt2;

/**
 *
 * @author ADMIN
 */
public class cau1 {
    public static void main(String[] args) {
        SachThamKhao k=new SachThamKhao("toan lop 5","giao duc", true, 50);
        k.setMa();
        System.out.println(k);
        SachGiaoKhoa g=new SachGiaoKhoa("tieng Viet", "dong nai", 4, 1, false, 80);
        g.setMa();
        System.out.println(g);
    }
}
