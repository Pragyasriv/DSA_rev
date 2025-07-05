import java.util.Stack;

public class postfixToPrefix {
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static String postfix_to_prefix(String str) {
        Stack<String> stack = new Stack<>();

        int l = str.length(); 

        for(int i = 0; i < l; i++) {
            char c = str.charAt(i);
            if(isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String temp = c + op2 + op1;
                stack.push(temp);
            }else {
                stack.push(c + "");
            }
        }
        return stack.peek();
    }

    public static void main(String args[])
    {
        String post_exp = "ABC/-AK/L-*";

        // Function call
        System.out.println("Prefix : "+ postfix_to_prefix(post_exp));
    }
}
