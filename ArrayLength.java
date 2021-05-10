import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        int[] IntArray = new int[5];
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        for(int i=0;i<5;i++){
            IntArray[i] = sc.nextInt();
        }
        for (int j : IntArray) {
            sum += j;
        }
        System.out.println("평균은 " + (double)sum/IntArray.length);
        sc.close();
    }
}
