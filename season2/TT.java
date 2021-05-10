package season2;

class A{
    A(){
        System.out.println("A 생성자 호출");
    }
}
class B extends A{
    B(){
        System.out.println("B 생성자 호출");
    }
}


public class TT {
    public static void main(String[] args){
        B b = new B();
    }
}
