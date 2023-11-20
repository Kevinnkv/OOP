
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Kevin
 */
class Time {

    private int h, m, s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public String toString() {
        return h + " " + m + " " + s;
    }

}

public class J05033_SapXepThoiGian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        Time[] inTimes = new Time[t];

        while (t-- > 0) {
            inTimes[t] = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(inTimes, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.getH() != o2.getH()) {
                    return o1.getH() - o2.getH();
                }
                if (o1.getM() != o2.getM()) {
                    return o1.getM() - o2.getM();
                }
                return o1.getS() - o2.getS();
            }

        });
        for (Time i : inTimes) {
            System.out.println(i);
        }
    }
}
