
package com.mycompany.codeptit;

import java.util.Scanner;

public class J01006 {
    long f[]= new long[93];
    public void fibo(){
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for(int i=3;i<=92;i++){
            f[i]=f[i-1]+f[i-2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long n = sc.nextLong();
            J01006 obj = new J01006();
            obj.fibo();
            System.out.println(obj.f[(int) n]);
        }
    }
}
