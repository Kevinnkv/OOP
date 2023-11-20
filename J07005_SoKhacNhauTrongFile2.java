
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args)throws IOException{
        DataInputStream dis =new DataInputStream(new FileInputStream("DATA.IN"));
        int[] d=new int[1000];
        for(int i=0;i<100000;i++){
            d[dis.readInt()]++;// doc 1 so nguyen tu DataInputStream va tang so lan xuat hien len 1
        }
        for(int i=0;i<1000;i++){
            if(d[i]>0) System.out.println(i+" "+d[i]);
        }
    }
}
