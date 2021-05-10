package TASK2;
import java.util.Scanner;
public class work_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[];
        int n,j=0;
        System.out.print("정수 몇개? >> ");
        n = sc.nextInt();
        array = new int[n];
        for(int i=0; i<n; i++) {
            int tmp = (int)(Math.random()*100+1);
            while(true){
                if(tmp == array[j]){
                    i--;
                    break;
                }
                if(i == j){
                    break;
                }
                j++;
            }
            array[i] = tmp;
        }

        for(int i=0; i<n; i++) {
            if(i%10 == 0 && i != 0) System.out.println();
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
