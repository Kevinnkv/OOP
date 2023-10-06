
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class J03009_TapTuRiengCua2Xau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Đọc dòng trống sau nextInt()

        while (t-- > 0) {
            // Khai báo chuỗi s1 và dùng split để các từ bởi khoảng trống
            String[] s1 = sc.nextLine().split("\\s");
            String s2 = sc.nextLine();
            // tạo chuỗi s3 gồm các từ thuộc s1 mà không thuộc s2
            HashSet<String> s3 = new HashSet<>();
            for(String word : s1){
                if(!s2.contains(word)){
                    s3.add(word);
                }
            }
            for(String x : s3){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        
    }
}
