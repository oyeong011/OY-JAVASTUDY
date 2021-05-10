import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Mycalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            Information();//입력하라는 기본 안내문 출력
            String str = sc.nextLine();
            String[] Array = str.split(" ");//입력받고 스트링 배열에 저장하기
            if(zeroSearch(Array)){
                System.out.println("수식입력이 잘못되었습니다.");
                continue;
            }
            else if(susicFront(Array)){
                System.out.println("수식이 맨앞이나 맨뒤에 있습니다.");
                continue;
            }
            else if(suSicSuSic(Array)){
                System.out.println("연산자가 연속으로 두개 들어가있습니다.");
                continue;
            }
            else if(ESangHanSic(Array)){
                System.out.println("잘못된 수식을 입력하였습니다.");
                continue;
            }
            else if(guaLHo(Array)){
                System.out.println("괄호의 개수가 같지 않습니다");
                continue;
            }
            else if(NotMiNiUS(Array)){
                System.out.println("음수를 입력했습니다.");
                continue;
            }

            String[] PostFix;

            PostFix = InfixPostfix(Array);//postFix로 바꾸기
            PostFix = nullRemove(PostFix);//널문자제거



            System.out.print(">PostFix로 변환 : ");
            for (String postFix : PostFix) {
                System.out.print(postFix);
            }

            System.out.println();

            System.out.println("계산을 시작할까요? (Y/N)");
            String choice = sc.next();


            if(choice.equals("Y")){
                System.out.println("계산 값 : " + PostfixCal(PostFix));
            }
            else if (choice.equals("N")) {
                    break;
            }

            System.out.println("계속하시겠습니까?");
            choice = sc.next();

            if(choice.equals("Y")){
                sc.nextLine();
                continue;
            }
            else if(choice.equals("N")){
                break;
            }
        }
        System.out.println("사용해주셔서 감사합니다.");
        System.out.println("프로그램을 종료합니다.");
        System.out.println("=========================");



    }

    public static String[] InfixPostfix(String[] arr) {
        String symbol;
        Stack<String> temp = new Stack<>();
        String[] Finish = new String[arr.length];
        int Fnum=0;

        for (String s : arr) {
            symbol = s;
            if (Priority(symbol) == 0) {
                Finish[Fnum] = symbol;
                Fnum++;
            } else if (symbol.equals("(")) {
                temp.push(s);
            } else if (symbol.equals(")")) {
                while (!temp.peek().equals("(")) {
                    Finish[Fnum] = temp.pop();
                    Fnum++;
                }
                temp.pop();
            } else {
                while (!temp.empty() && !(temp.peek().equals("(")) && Priority(symbol) <= Priority(temp.peek())) {
                    Finish[Fnum] = temp.pop();
                    Fnum++;
                }
                temp.push(symbol);
            }
        }
        while(!temp.empty()){
            Finish[Fnum] = temp.pop();
            Fnum++;
        }

        return Finish;
    }

    static int Priority(String x){
        if(x.equals("+") || x.equals("-")){
            return 1;
        }
        if(x.equals("*")||x.equals("/")){
            return 2;
        }
        if(x.equals("(")||x.equals(")"))
            return 3;
        return 0;
    }

    public static Double PostfixCal(String[] post){
        double number;
        double number1;
        double R;
        Stack<Double> S = new Stack<>();
        for (String s : post) {
            if (Priority(s) == 0) {
                S.push(Double.parseDouble(s));
            } else if (s.equals("+")) {
                number = S.pop();
                number1 = S.pop();
                R = number + number1;
                S.push(R);
            } else if (s.equals("-")) {
                number = S.pop();
                number1 = S.pop();
                R = number1 - number;
                S.push(R);
            } else if (s.equals("*")) {
                number = S.pop();
                number1 = S.pop();
                R = number1 * number;
                S.push(R);
            } else if (s.equals("/")) {
                number = S.pop();
                number1 = S.pop();
                R = number1 / number;
                S.push(R);
            }
        }
        R = S.pop();
        return R;
    }

    public static String[] nullRemove(String [] nullArr){
        for (int i = 0; i < nullArr.length; i++) {
            if (nullArr[i] == null) {
                nullArr = Arrays.copyOf(nullArr, i);
                break;
            }
        }
        return nullArr;
    }

    public static void Information(){
        System.out.println("=======Mycalculator=======");
        System.out.println("Mycalculator를 사용을 환영합니다.");
        System.out.println();
        System.out.println("Infix로 수식을 입력하시오. 수식을 하나 입력하실떄마다 한칸씩 띄어서 입력해주십시오 EX) 5 + 4 + ( 5 + 4 ) <enter> ");
        System.out.print(">");
    }


    public static boolean susicFront(String[] arr){
        if(arr[0].equals("+") || arr[0].equals("-") || arr[0].equals("*") || arr[0].equals("/")){
            return true;
        }
        else return arr[arr.length-1].equals("+") || arr[arr.length-1].equals("-") || arr[arr.length-1].equals("*") || arr[arr.length-1].equals("/");
    }

    public static boolean suSicSuSic(String[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")){
                if(arr[i+1].equals("+") || arr[i+1].equals("-") || arr[i+1].equals("*") || arr[i+1].equals("/")){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean ESangHanSic(String[] arr){
        for(String a : arr){
            try{
                Double.parseDouble(a);
            }
            catch (Exception e){
                switch(a){
                    case "+":
                    case "-":
                    case "/":
                    case "*":
                    case "(":
                    case ")":
                    case ".":
                        continue;
                    default :
                        return true;
                }
            }
        }
        return false;
    }

    public static boolean zeroSearch(String[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("/")){
                if (arr[i+1].equals("0")){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean guaLHo(String[] arr){
        int front = 0;
        int back = 0;
        for(String t : arr){
            if(t.equals("(")){
                front++;
            }
            else if(t.equals(")")){
                back++;
            }
        }
        return front != back;
    }
    public static boolean NotMiNiUS(String[] arr){
        double num;
        for(String n : arr){
            num = Double.parseDouble(n);
            if(num < 0){
                return true;
            }
        }
        return false;
    }
}