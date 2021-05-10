package season2;
import java.util.Scanner;
public class P11 {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        String name;
        int first;
        String second;

        System.out.println("시작");
        name = keyboard.nextLine();
        System.out.println("숫자 2개 입력(enter 두번 )");
        first=keyboard.nextInt();
        second=keyboard.nextLine();
        System.out.println("결과 : " + name + " -> " + first + second);

    }
}
