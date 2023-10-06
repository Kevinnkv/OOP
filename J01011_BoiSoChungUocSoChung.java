import java.util.Scanner;

public class J01011_BoiSoChungUocSoChung {
    
    public static long gcd(long a,long b){
        while(a != b){
            if(a > b ) a -= b;
            else b -= a;
        
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(a*b/gcd(a,b)+" "+gcd(a,b));
        }
    }
}
