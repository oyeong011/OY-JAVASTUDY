package season2;

import java.util.Scanner;

public class UNIT {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        System.out.print("금액을 입력하십시오>>");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count1, count2, count3, count4, count5, count6;
        if(num >= 50000){
            count1 = num/50000;
            num -= 50000*count1;
        }
        else if(num >= 10000){
            count2 = num/10000;
            num -= count2*10000;
        }
        else if(num>=1000){
            count3 = num/1000;
            num -= num*1000;
        }
        else if(num >=100){
            count4 = num/100;
            num -= num*100;
        }
        else if(num >= 10){

        }
    }
}
