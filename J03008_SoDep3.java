
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class J03008_SoDep3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Đọc dòng trống sau nextInt()

        while (t-- > 0) {
            String s = sc.nextLine();
            boolean isBeautiful = true;

            // Kiểm tra thuận nghịch
            String reverse = new StringBuilder(s).reverse().toString();
            if (!s.equals(reverse)) {
                isBeautiful = false;
            }
            // Kiểm tra nguyên tố
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7') {
                    isBeautiful = false;
                    break;
                }
            }

            if (isBeautiful) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
