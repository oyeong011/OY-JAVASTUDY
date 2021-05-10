package season2;

public class P10 {
    public static void main(String args[]){
        temp t = new temp();
        t.increase().increase().increase().print();
    }
}
class temp{
    int temperature = 0;

    temp increase(){
        temperature++;
        return this;
    }
    void print(){
        System.out.println(temperature);
    }
}

