package P8;

public class Postfix03 {
    int n, top;
    char[] stack;

    Postfix03(int total){
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    void push(char c){
        top++;
        stack[top] = c;
    }

    char pop(){
        char item = stack[top];
        top--;
        return item;
    }

    boolean IsOperand(char c){
        if ((c >='A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c == ' ' || c == '.')) {
            return true;
        } else {
            return false;
        }
    }
    
    boolean isOperator(char c){
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    int derajat(char c){
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    String konversi (String Q){
        String P = "";
        char c;
        for (int index = 0; index < n; index++) {
            c = Q.charAt(index);
            if (IsOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                push(c);
            }
            if (c == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                pop();
            }
            if (isOperator(c)) {
                while (derajat(stack[top]) >= derajat(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
}
