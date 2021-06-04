import java.util.Random;

public class Sorting {
    static int [] Array = new int[32];
    static int[] tmp = new int[32];
    public static void main(String[] args) {
        Sorting sort = new Sorting();


        //sort.Insertion();
        //sort.Selection();
        //sort.Shuffle();
        //sort.MergeSorting(0,Array.length-1);
        //sort.PrintSorting();
        sort.Shuffle();
        sort.QuickSorting(0, Array.length-1);
        sort.PrintSorting();
    }

    private void Shuffle(){
        Random r = new Random();
        for(int i=0;i<Array.length;i++){
            Array[i] = r.nextInt(33);
            for(int j=0; j<i;j++){
                if(Array[j] == Array[i]){
                    i--;
                }
            }
        }
        System.out.println("초기 배열 : ");
        PrintSorting();
        System.out.println();
    }
    private void Insertion(){
        Shuffle();
        int temp;
        for(int i=1; i<32;i++){
            for(int j=i;0<j;j--) {
                if (Array[j-1] > Array[j]) {
                    temp = Array[j-1];
                    Array[j-1] = Array[j];
                    Array[j] = temp;
                }
            }
            System.out.println(i+"번째 정렬");
            for(int a=0;a<i;a++){
                System.out.print(Array[a] + " ");
            }
        }
        System.out.println("삽입 정렬");
        PrintSorting();
        System.out.println();
    }

    private void Selection(){
        Shuffle();
        int tmp=0;
        int temp;
        for(int i=0;i<Array.length-1;i++){
            tmp = i;
            for(int j=i;j<Array.length;j++){
                if(Array[tmp] > Array[j]){
                    tmp = j;
                }
            }
            temp = Array[tmp];
            Array[tmp] = Array[i];
            Array[i] = temp;
        }
        System.out.println("선택정렬");
        PrintSorting();
    }

    private void MergeSorting(int start, int end){
        if(start==end) {
            return;
        }
        if (start<end) {
            int mid = (start+end) / 2;
            MergeSorting(start, mid);
            MergeSorting(mid+1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;
            while (p<=mid || q<=end) {
                if (q>end || (p<=mid && Array[p]<Array[q])) {
                    tmp[idx++] = Array[p++];
                } else {
                    tmp[idx++] = Array[q++];
                }
            }

            for (int i=start;i<=end;i++) {
                Array[i]=tmp[i];
            }
        }
    }

    private void QuickSorting(int down, int up){
        if(down >= up)return;

        int mid = partition(down, up);
        QuickSorting(down, mid-1);
        QuickSorting(mid,up);
    }

    private static int partition(int low, int high) {
        int pivot = Array[(low + high) / 2];
        while (low <= high) {
            while (Array[low] < pivot) low++;
            while (Array[high] > pivot) high--;
            if (low <= high) {
                swap(low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(int i, int j) {
        int tmp = Array[i];
        Array[i] = Array[j];
        Array[j] = tmp;
    }

    private void PrintSorting(){
        for(int a=0;a<Array.length;a++){
            System.out.print(Array[a]+" ");
        }
    }
}
