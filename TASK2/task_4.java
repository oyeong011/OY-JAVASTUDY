package TASK2;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        System.out.print("정수 3개 입력>>");
        Scanner sc = new Scanner(System.in);

        int num1,num2,num3;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3){
            System.out.println("중간 값은 "+num2);
        }
        else if(num2 < num1 && num1 < num3){
            System.out.println("중간 값은 "+num1);
        }
        else{
            System.out.println("중간 값은 " + num3);
        }
    }
}
