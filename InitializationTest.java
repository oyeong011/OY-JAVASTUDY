class Window{
    Window(int marker){
        System.out.println("Window(" + marker + ")");
    }
}

class House{
    House(){
        System.out.println("House( )");
        w3 = new Window(33);
    }
    Window w1 = new Window(1);
    Window w2 = new Window(2);
    Window w3 = new Window(3);
    void f(){
        System.out.println("f( )");
    }
}
public class InitializationTest {
    public static void main(String[] args) {
        House h = new House();
    }
}
