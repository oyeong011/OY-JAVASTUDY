package TASK2;

public class work_10 {
    public static void main(String[] args) {
        int Array[][] = new int[4][4];
        int temp;
        int tmp;

        for(int result=0;result<10;) {
            temp = (int)(Math.random()*4);
            tmp = (int)(Math.random()*4);
            if(Array[tmp][temp]==0) {
                Array[tmp][temp] = (int)(Math.random()*10+1);
                result++;
            }
        }

        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
