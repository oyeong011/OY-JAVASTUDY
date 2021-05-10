import java.util.Stack;
public class InfixToPostfix {
    private Stack stack;
    public String infix = "";
    public String inputToPostfix = "";

    public InfixToPostfix() {
        this.stack = new Stack<>();
    }

    public Stack getStack() {
        return stack;
    }

    public int calcPostfix(){
        for(int i = 0; i < inputToPostfix.length(); i++){
            char token = inputToPostfix.charAt(i);
            System.out.println("clac token : " + token);

            if(isNumber(token)) stack.push(Character.digit(token,10));
            else{
                int n1 = (Integer) stack.pop();
                int n2 = (Integer) stack.pop();
                int operateRes = operateToken(token,n2,n1);

                System.out.println("operateRes : " + operateRes);
                stack.push(operateRes);
            }
            System.out.println(stack);
        }
        return (Integer)stack.pop();
    }

    private int operateToken(char operater,int n1, int n2){
        switch (operater){
            case '*' :
                return n1 * n2;
            case '/' :
                return n1 / n2;
            case '+' :
                return n1 + n2;
            case '-' :
                return n1 - n2;
        }
        return 0;
    }

    public String getOutput(){
        pushInStackForPostfix();
        return inputToPostfix;
    }
    private void pushInStackForPostfix(){
        for(int i=0; i < infix.length(); i++){
            char token = infix.charAt(i);
            System.out.println("token : " + token);

            if(isNumber(token)){
                inputToPostfix += token;
            }else{
                if(token == '('){
                    stack.push(token);
                }else{
                    sortOperater(token);
                }

                System.out.println("==out==\n" + inputToPostfix);
            }
        }
        clearStack();
    }

    private void sortOperater(char input){
        System.out.println("==stack==\n" + stack.toString() + "\n ====");
        if(stack.empty()){ stack.push(input); return;}

        if(input == ')'){
            while(!stack.isEmpty()){
                char inClose = (Character) stack.pop();
                if(inClose == '(') break;
                inputToPostfix += inClose;
            }
        }else {
            int inputGarde = getOperaterGrade(input);

            while (!stack.isEmpty()) {
                char prev = (Character)stack.pop();
                if(prev == '('){
                    stack.push(prev);
                    break;
                }
                int prevGarde = getOperaterGrade(prev);

                if (prevGarde >= inputGarde) {
                    inputToPostfix += prev;
                } else {
                    stack.push(prev);
                    break;
                }

            }
            stack.push(input);
        }
    }

    public boolean isNumber(char token){
        if('0' <= token && token <= '9')
            return true;
        else
            return false;
    }

    private int getOperaterGrade(char operater){
        int grade = 0;
        switch (operater){
            case '*' : case '/' : case '%':
                grade = 2;
                break;
            case '+' : case '-' :
                grade = 1;
                break;
            case '(' :
                grade = 0;
                break;
        }
        return grade;
    }

    private void clearStack(){
        char token;
        while(!stack.empty()){
            token = (Character)stack.pop();
            inputToPostfix += token;
        }
    }
}