package season2;

import java.util.Scanner;

public class T2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1<num2&&num3<num2){
            if(num2<num1+num3) System.out.println("삼각형이됩니다");
        }
        else if(num2<num3&&num2<num3){
            if(num3<num1+num2) System.out.println("삼각형이됩니다");
        }
        else{
            if(num1<num2+num3) System.out.println("삼각형이됩니다");
        }
    }
}
