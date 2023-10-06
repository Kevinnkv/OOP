
import java.util.Scanner;

public class J02004_MangDoiXung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int check = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != a[n - i - 1]) {
                    check = 1;
                    break;
                }
            }
            if (check == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
