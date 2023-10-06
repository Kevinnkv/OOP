
import java.util.Scanner;


/**
 *
 * @author Kevin
 */
public class J03007_SoDep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Đọc dòng trống sau nextInt()

        while (t-- > 0) {
            String s = sc.nextLine();
            boolean isBeautiful = true;

            // Kiểm tra số đầu và cuối có phải là '8'
            if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') {
                isBeautiful = false;
            }

            // Tính tổng chữ số
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
            }

            // Kiểm tra tổng chia hết cho 10
            if (sum % 10 != 0) {
                isBeautiful = false;
            }
            // Kiểm tra thuaạn nghịch
            String reverse = new StringBuilder(s).reverse().toString();
            if(!s.equals(reverse)){
                isBeautiful = false;
            }
            if (isBeautiful) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
