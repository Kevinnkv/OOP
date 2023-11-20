/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baikt2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class cau2 {
    public static void main(String[] args) {
        QuanLysach q=new QuanLysach();
        Scanner in=new Scanner(System.in);
        q.nhapSachThamKhao(in);
        q.nhapSachGiaoKhoa(in);
        q.out();
    }
}
