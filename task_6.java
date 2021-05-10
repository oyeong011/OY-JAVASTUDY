import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        System.out.print("1~99 사이의 정수를 입력하시오>>");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ten = num/10;
        int one = num%10;
        int count = 0;

        if(ten/3==1|ten/6==1|ten/9==1){
            count++;
        }
        if(one/3==1 | one/6==1 | one/9==1){
            count++;
        }

        if(count == 1){
            System.out.println("박수짝");
        }
        if(count == 2){
            System.out.println("박수짝짝");
        }
    }
}
