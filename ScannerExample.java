import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println(">>");
        while(s1.hasNext()){
            System.out.println(s1.next());
        }
    }
}
