public class ValuePassing {
    public static void main(String[] args) {
        int n =10;
        increase(n);

        System.out .println(n);
        System.out.println(increase(n));
    }

    public static int increase (int m){
        m = m + 1;
        return m;
    }
}
