import java.util.Scanner;

public class task_12 {
    public static void main(String[] args) {
        System.out.print("연산>>");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        String sign = sc.next();
        double num2 = sc.nextDouble();
        double last=0;
        if(sign.equals("+")){
            last= num1+num2;
            System.out.println(num1+sign+num2+"의 계산결과는 "+last);
        }
        else if (sign.equals("-")){
            last = num1-num2;
            System.out.println(num1+sign+num2+"의 계산결과는 "+last);
        }
        else if (sign.equals("*")){
            last = num1*num2;
            System.out.println(num1+sign+num2+"의 계산결과는 "+last);
        }
        else if (sign.equals("/")) {
            last = num1 / num2;
            System.out.println(num1 + sign + num2 + "의 계산결과는 " + last);
        }
    }
}

