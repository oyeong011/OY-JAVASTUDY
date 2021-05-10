import java.util.Scanner;
public class Testpanbyul {
    public static void main(String[] args) {
        System.out.print("시험점수 : ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        if(number>=80){
            System.out.println("합격");
        }
        else{
            System.out.println("불합격");
        }
        s.close();
    }
}
