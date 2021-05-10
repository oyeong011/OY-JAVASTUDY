package TASK2;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        System.out.print("2자리수 정수 입력(10~99)>>");
        Scanner scanner = new Scanner(System.in);

        int math,ten,one;

        math = scanner.nextInt();
        ten = math / 10;
        one = math % 10;

        if (ten == one)
            System.out.println("YES! 10의 자리와 1의 자리가 같습니다.");
        else System.out.println("NO! 10의 자리와 1의자리가 같지않습니다.");
    }
}
