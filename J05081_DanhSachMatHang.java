
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
class MatHang {
    private String id, name, unit;
    private int buyPrize, sellPrize;
    private static int cnt = 1;

    public MatHang(String name, String unit, int buyPrize, int sellPrize) {
        this.id = "MH" + String.format("%03d", cnt++);
        this.name = name;
        this.unit = unit;
        this.buyPrize = buyPrize;
        this.sellPrize = sellPrize;
    }

    int getProfit() {
        return sellPrize - buyPrize;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + buyPrize + " " + sellPrize + " " + getProfit();
    }
}

public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Bổ sung dòng này để loại bỏ kí tự thừa sau khi nhập số nguyên 'n'
        ArrayList<MatHang> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(new MatHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }

        Collections.sort(list, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o2.getProfit() - o1.getProfit();
            }
        });

        for (MatHang i : list) {
            System.out.println(i);
        }
    }
}
