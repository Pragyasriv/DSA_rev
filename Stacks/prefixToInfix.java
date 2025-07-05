import java.util.Stack;

public class prefixToInfix {
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static String prefix_to_infix(String str) {
        Stack<String> stack = new Stack<>();
        
        int l = str.length();

        for(int i = l-1; i >= 0; i--) {
            char c = str.charAt(i);
            if(isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            } else {
                stack.push(c + "");
            }
        }
        return stack.pop();
    }

    public static void main(String[] args){
        String exp = "*-A/BC-/AKL";
        System.out.println("Infix : " + prefix_to_infix(exp));
}
}
