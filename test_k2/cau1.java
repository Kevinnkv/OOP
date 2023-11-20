/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_k2;

/**
 *
 * @author ADMIN
 */
public class cau1 {
    public static void main(String[] args) {
        TapChi t = new TapChi("KHCNTT TT",250,"10/2023");
        t.setMa();
        System.out.println(t);
        Sach s = new Sach("LT HDT","Nguyen Manh Son","Giao duc", 220,1000);
        s.setMa();
        System.out.println(s);
    }
}
/*
KT001 KHCNTT TT 250 10/2023 20
SON002 LT HDT Nguyen Manh Son giao duc 1000 98
*/
