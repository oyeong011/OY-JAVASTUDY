import java.util.Scanner;

public class guaje_12 {
    public static void main(String[] args) {
        Status Pikaboo = new Status();
        Scanner sc = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(true) {
            System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >>");
            int choice = sc.nextInt();
            if (choice == 1 || choice == 3) {
                Pikaboo.sector_show(choice);
            } else if (choice == 2) {
                Pikaboo.show();
            }
            else if (choice == 4) {
                break;
            }
            else{
                System.out.println("없는 메뉴입니다. 다시 시도하세요");
                continue;
            }
        }
        sc.close();
    }
}
class Status {
    Scanner sc = new Scanner(System.in);
    public static String[][] LeftStone = new String[3][11];
    public Status(){
        LeftStone[0] = new String[]{"S>>", "___", "___", "___", "___", "___", "___", "___", "___", "___", "___"};
        LeftStone[1] = new String[]{"A>>", "___", "___", "___", "___", "___", "___", "___", "___", "___", "___"};
        LeftStone[2] = new String[]{"B>>", "___", "___", "___", "___", "___", "___", "___", "___", "___", "___"};
    }
    public void show(){
        for(int i=0;i<3;i++){
            for(int y=0;y<11;y++) {
                System.out.print(LeftStone[i][y]+" ");
            }
            System.out.println();
        }
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    public void sector_show(int choice){
        int num;
        while(true) {
            System.out.print("좌석구분 S(1), A(2), B(3)>>");
            num = sc.nextInt();
            if (num > 3) {
                System.out.println("없는 번호입니다. 다시 시도하세요");
                continue;
            }
            for (int y = 0; y < 11; y++) {
                System.out.print(LeftStone[num - 1][y] + " ");
            }
            System.out.println();
            if (choice == 1) {
                System.out.print("이름>>");
                String name = sc.next();
                System.out.print("번호>>");
                int Sitnumber = sc.nextInt();
                if (Sitnumber > 10) {
                    System.out.println("없는 번호입니다 다시 시도하세요");
                    continue;
                }
                this.add(name, num, Sitnumber);
                return;
            }
            break;
        }
        if (choice == 3) {
            System.out.print("이름>>");
            String name = sc.next();
            this.Remove(num, name);
        }
    }

    public String[][] add(String name, int num_hang, int num_yeol){
        if(LeftStone[num_hang-1][num_yeol].equals("___")) {
            LeftStone[num_hang - 1][num_yeol] = name;
        }
        else{
            System.out.println("자리가 이미 차있습니다.");
        }
        return LeftStone;
    }

    public String[][] Remove(int number, String name){
        int i;
        while(true) {
            for (i = 1; i < 11; i++) {
                if (LeftStone[number - 1][i].equals(name)) {
                    LeftStone[number - 1][i] = "___";
                    return LeftStone;
                }
            }
            if (i == 11) {
                System.out.println("없는이름입니다.");
                return LeftStone;
            }
        }
    }
}

