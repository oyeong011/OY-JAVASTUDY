package TASK2;
import java.util.Scanner;
public class work_6 {
    public static void main(String[] args) {
        int[] MOMM = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오 >> ");
        int MOM = sc.nextInt();

        for(int i=0; i<MOMM.length; i++) {
            if(MOM/MOMM[i]!=0) {
                System.out.printf("%d 원 짜리 : %d개 \n", MOMM[i], MOM / MOMM[i]);
            }
            MOM = MOM - (MOM / MOMM[i]) * MOMM[i];
        }
        sc.close();
    }
}
