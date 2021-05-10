public class FinalExample {
    public static final double PI_VALUE;
    //Constructor
    static{
        PI_VALUE = 3.14;
    }
    public FinalExample() {
        //PI_VALUE = 3.14;
    }

    public static void main(String[] args) {
        final double PI;
        int radius = 1;

        PI = 3.14;

        double perimeter = 2 * PI * radius;
    }
}
