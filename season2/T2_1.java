package season2;

import java.util.Scanner;

public class T2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        num = num/1100.0;

        System.out.println(num*1100+ " 원은 " + "$"+num + "입니다.");
    }
}
