/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLy {
    List<PTGT> ds = new ArrayList<>();

    public QuanLy() {
    }
    
    public List<PTGT> getDs() {
        return ds;
    }

    public void setDs(List<PTGT> ds) {
        this.ds = ds;
    }
    public void nhap(Scanner in){
        PTGT newPtgt = new PTGT(in.nextLine());
        
    }
    public void nhapOto(Scanner in){
        
    }
}
