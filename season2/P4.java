package season2;

public class P4 extends P4_a{
    public P4(){
        a++;
    }
    public static void main(String args[]){
        P4_a a = new P4();
        (a.a)++;
        System.out.println(a);
    }
}
class P4_a{
    int a = 0;
}