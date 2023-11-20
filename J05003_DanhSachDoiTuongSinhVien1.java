
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
class Student {

    private String id;
    private String name, grade, birthDay;
    private double gpa;
    private static int cnt = 1;

    public Student(String name, String grade, String birthDay, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", cnt++);
        this.name = name;
        this.grade = grade;
        this.birthDay = birthDay;
        this.gpa = gpa;
    }

    public void chuanHoa() {
        StringBuilder sb = new StringBuilder(birthDay);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        this.birthDay = sb.toString();
    }

    @Override
    public String toString() {
        chuanHoa();
        return id + " " + name + " " + grade + " " + birthDay + " " + String.format("%.2f", gpa);
    }

}

public class J05003_DanhSachDoiTuongSinhVien1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> sv = new ArrayList<>();
        sc.nextLine();
        while (n-- > 0) {
            String name = sc.nextLine();
            String grade = sc.nextLine();
            String birthDay = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            Student s = new Student(name, grade, birthDay, gpa);
            sv.add(s);

        }
        for (Student x : sv) {
            System.out.println(x);
        }
    }
}
/*
1
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
*/
