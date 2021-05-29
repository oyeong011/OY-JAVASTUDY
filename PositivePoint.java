class Point{
    int x;
    int y;
    void move(int put, int input){
        x = put;
        y = input;
    }
    public String toString(){
        return "("+ x + "," + y + ")의 점";
    }
}

class PositivePoint extends Point {
    PositivePoint(int xInput, int yInput){
        if(xInput<0||yInput<0){
            xInput =0;
            yInput = 0;
        }
        super.move(xInput,yInput);
    }
    PositivePoint(){
        super.move(0,0);
    }
    void move(int put, int input){
        if(put<0||input<0){
            put = x;
            input = y;
        }
        super.move(put,input);
    }

    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10,10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5,5);
        System.out.println(p.toString()+"입니다.");

        PositivePoint p2 = new PositivePoint(-10,-10);
        System.out.println(p2.toString() + "입니다.");
    }
}
