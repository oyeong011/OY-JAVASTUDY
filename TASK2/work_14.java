package TASK2;

import java.util.Scanner;

public class work_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score[]  = {95, 88, 76, 62, 55};
        String n = new String();
        int number;
        int i=0;
        while(true){
            System.out.print("과목 이름>>");
            n = sc.next();
            if(n.equals("그만")){
                return;
            }
            for(i=0;i<5;i++){
                if(course[i].equals(n)){
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    break;
                }
            }
            if(i == 5){
                System.out.println("없는 과목입니다.");
            }
        }
    }
}
