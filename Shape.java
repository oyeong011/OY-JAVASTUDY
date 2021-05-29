interface Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("--- 다시 그립니다.");
        draw();
    }
}

class Circle implements Shape{
    private double radius;
    Circle(int radius){
        this.radius = radius;
    }

    public static void main(String[] args) {
        Shape donut = new Circle(10);
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + (int)radius + "인 원입니다.");
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }
}
class Oval implements Shape{
    double width;
    double vertical;
    Oval(double x, double y){
        width = x;
        vertical = y;
    }
    @Override
    public void draw() {
        System.out.println((int)width+"x"+(int)vertical + "에 내접하는 타원입니다");
    }

    @Override
    public double getArea() {

        return width*vertical*PI;
    }
}
class Rect implements Shape{
    double width;
    double vertical;
    Rect(double x, double y){
        width = x;
        vertical = y;
    }
    @Override
    public void draw() {
        System.out.println((int)width+"x"+(int)vertical + " 크기의 사각형 입니다");
    }

    @Override
    public double getArea() {
        return width*vertical;
    }
}
class GuaJe_14{
    public static void main(String[] args) {
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10,40);

        for (Shape shape : list) shape.redraw();
        for (Shape shape : list) System.out.println("면적은 " + shape.getArea());
    }
}