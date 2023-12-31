
import java.util.*;

public class J01014_UocSoNguyenToLonNhat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long res = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    res = Math.max(res, i);
                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }
            System.out.println(Math.max(res, n));
        }
    }
}
