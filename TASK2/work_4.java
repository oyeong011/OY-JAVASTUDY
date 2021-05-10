package TASK2;

import java.util.Scanner;

public class work_4 {
    public static void main(String[] args) {
        String word;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오");
        word = sc.next();
        c = word.charAt(0);
        for(int i=0;i<=c-'a';i++){
            for(char l = 'a';l<=c-i;l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
