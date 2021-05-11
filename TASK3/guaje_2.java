package TASK3;

import java.util.Scanner;

public class guaje_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("수학 과학 영어 순으로 3개의 점수 입력 >>");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + Grade.average());

        sc.close();
    }
}
class Grade(int math, int science, int english){
    public Grade(int math, int science, int english) {

    }

    public static double average(int math, int science, int english){
        double Result = (math + science + english) / 3;
        return Result;
    }
}
