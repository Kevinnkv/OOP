
import java.util.Scanner;

public class J02010_SapXepDoiChoTrucTiep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            boolean check = false;
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    check = true;

                }
            }
            if (check) {
                System.out.print("Buoc " + cnt + ": ");
                for (int x : a) {
                    System.out.print(x + " ");
                }
                cnt++;
            }
            System.out.println();
        }
    }
}
