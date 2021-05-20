package TASK3;

import java.util.Scanner;

class PhoneBook{
    String name;
    String tel;
    public PhoneBook(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
}
public class guaje_8 {
    public static void main(String[] args) {
        PhoneBook[] Phone;
        Scanner sc = new Scanner(System.in);

        System.out.print("인원수 >>");
        int num = sc.nextInt();
        Phone = new PhoneBook[num];

        for(int i=0;i<Phone.length;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = sc.next();
            String tel = sc.next();
            Phone[i] = new PhoneBook(name,tel);
        }
        System.out.println("저장되었습니다...");

        while(true){
            int tmp = 0;
            System.out.print("검색할 이름>>");
            String numname = sc.next();
            for(int a=0;a<Phone.length;a++){
                if(numname.equals(Phone[a].name)){
                    System.out.println(numname + "의 번호는 " + Phone[a].tel + "입니다.");
                    tmp = a;
                    break;
                }
                tmp = num;
            }
            if(numname.equals("그만"))break;
            if(tmp==num) System.out.println(numname + " 이 없습니다.");
        }
    }
}
