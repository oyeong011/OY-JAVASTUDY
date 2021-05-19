package TASK3;

import java.util.Scanner;

public class guaje_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수학 과학 영어 순으로 3개의 점수 입력 >>");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average(me));

        sc.close();
    }
}
class Grade{
    int num1,num2,num3,num4;
    public Grade(int math, int science, int english){
        num1 = math;
        num2 = science;
        num3 = english;
    }
    public int average(Grade me){
        num4 = (num1 + num2 + num3)/3;
        return num4;
    }
}
