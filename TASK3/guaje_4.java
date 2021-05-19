package TASK3;


public class guaje_4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,2,8,7);
        Rectangle s = new Rectangle(5,5,6,6);
        Rectangle t = new Rectangle(1,1,10,10);

        r.show();
        System.out.println("s의 면접은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
class Rectangle{
    int x;
    int y;
    int width;
    int height;
    int rec;
    public Rectangle(int a, int b, int c, int d){
        x = a;
        y = b;
        width = c;
        height = d;
    }
    public int square(){
        rec = width * height;
        return rec;
    }
    public void show(){
        System.out.println("(" + x + ", " + y + ")" + "에서 크기가 " + width + "x" + height+ "인 사각형");
    }
    public boolean contains(Rectangle r){
        if(x<r.x && y <r.y)
            if((width+x) > (r.x + r.width))
                return (height + y) > (r.y + r.height);
        return false;
    }
}