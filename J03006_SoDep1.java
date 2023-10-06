
import java.util.Scanner;

/**
 * So dep 1
 * @author Kevin
 */
public class J03006_SoDep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Đọc dòng trống sau nextInt()
        while(t --> 0){
            String s = sc.nextLine();
            boolean isBeutyful = true;
                for(int i=0;i<s.length();i++){
                    if((s.charAt(i)-'0') % 2 !=0){
                        isBeutyful = false;
                        break;
                    }
                }
                String reverse = new StringBuilder(s).reverse().toString();
                if(!isBeutyful || !s.equals(reverse))
                    System.out.println("NO");
                else System.out.println("YES");

            }
        }
    
}
