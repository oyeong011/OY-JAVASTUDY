import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        Scanner sc = new Scanner(System.in);
        double meter;

        int circleX1 = sc.nextInt();
        int circleY1 = sc.nextInt();
        int radius1 = sc.nextInt();
        System.out.print("두번쨰 원의 중심과 반지름 입력>>");
        int circleX2 = sc.nextInt();
        int circleY2 = sc.nextInt();
        int radius2 = sc.nextInt();

        meter = Math.sqrt((circleX1-circleX2)*(circleX1-circleX2)+(circleY1-circleY2)*(circleY1-circleY2));
        if(meter<=radius1+radius2){
            System.out.println("두 원은 서로 겹친다");
        }
        else System.out.println("두 원은 서로 겹치지않는다");
    }
}
