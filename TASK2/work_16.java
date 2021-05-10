package TASK2;

import java.util.Scanner;

public class work_16 {
    public static void main(String[] args) {
        System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
        Scanner sc = new Scanner(System.in);
        String RSP;
        String str[] = {"가위", "바위", "보"};
        int n;
        while(true){
            System.out.print("가위 바위 보!>>");
            RSP = sc.next();
            n = (int)(Math.random()*3);
            if(RSP.equals("그만"))break;
            if(RSP.equals("바위")){
                if(str[n].equals("바위")){
                    System.out.println("사용자 = " + RSP + ",컴퓨터 = "+ str[n] + ", 비겼습니다.");
                }
                else if(str[n].equals("가위")){
                    System.out.println("사용자 = " + RSP + ",컴퓨터 = "+ str[n] + ", 사용자가 이겼습니다.");
                }
                else if(str[n].equals("보")){
                    System.out.println("사용자 = " + RSP + ",컴퓨터 = "+ str[n] + ", 졌습니다.");
                }
            }
            else if(RSP.equals("가위")){
                if(str[n].equals("바위")){
                    System.out.println("사용자 = " + RSP + ",컴퓨터 = "+str[n] + ", 졌습니다.");
                }
                else if(str[n].equals("가위")){
                    System.out.println("사용자 = " + RSP + ",컴퓨터 = "+str[n] + ", 비겼습니다.");
                }
                else if(str[n].equals("보")){
                    System.out.println("사용자 = " + RSP + ",컴퓨터 = "+str[n] + ", 사용자가 이겼습니다.");
                }
            }
            else if(RSP.equals("보")){
                if(str[n].equals("바위")){
                    System.out.println("사용자 = " + RSP + ",컴퓨터 = "+str[n] + ", 사용자가 이겼습니다.");
                }
                else if(str[n].equals("가위")){
                    System.out.println("사용자 = " + RSP + ",컴퓨터 = "+str[n] + ", 졌습니다.");
                }
                else if(str[n].equals("보")){
                    System.out.println("사용자 = " + RSP + ",컴퓨터 = "+str[n] + ", 비겼습니다.");
                }
            }
        }
        System.out.println("게임을 종료합니다.");
    }
}
