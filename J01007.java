/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J01007 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] f = new long[100];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i < 100; ++i)
            f[i] = f[i - 1] + f[i - 2];
        while(t-- > 0)
        {
            long n = sc.nextLong();
            if(Arrays.binarySearch(f, 0, 92, n)< 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
