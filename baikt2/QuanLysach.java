/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baikt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLysach {
    List<SachHoc> list = new ArrayList<>();

    public QuanLysach() {
    }

    public List<SachHoc> getList() {
        return list;
    }

    public void setList(List<SachHoc> list) {
        this.list = list;
    }
    public void nhapSachGiaoKhoa(Scanner in){
        SachGiaoKhoa sgk = new SachGiaoKhoa(in.nextLine());
    }
    public void nhapSachThamKhao(Scanner in){
        SachThamKhao stk = new SachThamKhao(in.nextLine());
    }
    public void out(){
        for(SachHoc x :list){
            System.out.println(x);
        }
    }
}
/*
toan lop 4

su pham

true

70

toan

giao duc

8

2

true

48
*/