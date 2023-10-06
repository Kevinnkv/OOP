
import java.util.Scanner;

public class J02007_DemSoLanXuatHien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] mp = new int[100005];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                mp[a[i]]++;
            }
            System.out.println("Test " + j + ":");
            for (int i = 0; i < n; i++) {
                if (mp[a[i]] > 0) {
                    System.out.println(a[i] + " xuat hien " + mp[a[i]] +" lan");
                    mp[a[i]] = 0;
                }

            }
        }
    }
}
