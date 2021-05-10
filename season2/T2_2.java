package season2;

import java.util.Scanner;

public class T2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num10 = num/10;
        int num1 = num%10;

        if(num10==num1) {
            System.out.println("Yes! 10의자리와 1의 자리가 같습니다");
        }
    }
}
