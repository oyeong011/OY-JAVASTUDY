package season2;

public class P13 {
    public static void main(String [] args) {
        DObject start, n, obj;
        start = new Line();
        n = start;
        obj = new Rect();
        n.next = obj;
        n = obj;
        obj = new Line();
        n.next = obj;
        n = obj;
        obj = new Circle();
        n.next = obj;
        ; //결과값 : circle 출력하가 위한 한줄 -> start로 시작
    }
}
class DObject {
    public DObject next;
    public DObject() {
        next = null;
    }
    public void draw() {
        System.out.println("DObject draw");
    }
}
class Line extends DObject {
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends DObject {
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends DObject {
    public void draw() {
        System.out.println("Circle");
    }
}

