
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class J03010_DiaChiEmail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> list = new ArrayList<>();

        while (t-- > 0) {
            //.trim(): Loại bỏ khoảng trắng dư thừa ở đầu và cuối chuỗi
            //toLowerCase(): Chuyển đổi tất cả ký tự trong chuỗi thành chữ thường 
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+");
            String name = s[s.length - 1];
            for (int i = 0; i < s.length - 1; i++) {
                name += s[i].charAt(0);
            }
            list.add(name);
            int cnt = Collections.frequency(list, name);
            //để đếm số lần xuất hiện của name trong danh sách list
            System.out.println(name + (cnt == 1 ? "" : cnt) + "@ptit.edu.vn");
        }
    }
}
