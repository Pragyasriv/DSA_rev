import java.util.Stack;

public class prefixToPostfix {
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static String prefix_to_postfix(String str) {
        Stack<String> stack = new Stack<>();

        int l = str.length();
        for(int i = l - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if(isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String temp = op1 + op2 + c;
                stack.push(temp);
            }else {
                stack.push(c + "");
            }
        }
        return stack.peek();
    }

    public static void main(String args[])
    {
        String pre_exp = "*-A/BC-/AKL";
        System.out.println("Postfix : "+ prefix_to_postfix(pre_exp));
    }
}
