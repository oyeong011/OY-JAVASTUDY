package season2;

import java.util.Scanner;

public class T2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num%10 == 3 || num%10 ==6 || num%10 == 9) && (num/10==3 || num/10==6 || num/10==9)){
            System.out.println("박수짝짝");
        }
        else if((num%10 == 3 || num%10 ==6 || num%10 == 9) || (num/10==3 || num/10==6 || num/10==9)){
            System.out.println("박수짝");
        }
        else{
            return;
        }
    }
}
