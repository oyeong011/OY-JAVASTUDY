import java.util.Scanner;

public class task_8 {
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        if((x >= rectx1 && x<=rectx2) && (y >= recty1 && y <= recty2))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.print("두점(x1,y1),(x2,y2)을 입력하세요>>");
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        boolean A,B;

        A = inRect(x1,y1,100, 100, 200, 200);
        B = inRect(x2,y2,100, 100, 200, 200);

        if(A||B){
            System.out.println("충돌합니다");
        }
        else System.out.println("충돌하지 않습니다");
    }
}
