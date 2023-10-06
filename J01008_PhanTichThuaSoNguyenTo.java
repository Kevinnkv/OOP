
import java.util.Scanner;

public class J01008_PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        int stt = 0;
        while(t-->0){  
            stt++;
            long n = sc.nextLong();
            System.out.printf("Test %d: ",stt );
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n % i == 0){
                    int cnt = 0;
                    while(n % i == 0){
                        cnt ++;
                        n /= i;
                    }
                    System.out.printf("%d(%d) ",i,cnt);
                    
                }
             
            }
            if(n > 1){
                    System.out.printf("%d(%d)", n,1);
                }
            System.out.println();
        }
    }
    
}
