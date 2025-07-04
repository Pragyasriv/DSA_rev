import java.util.Stack;

public class infix_to_postfix {
    static int precedence(char c) {
        if(c == '^') return 3;
        else if(c == '*' || c == '/') return 2;
        else if(c == '+' || c == '-') return 1;
        else return -1;
    }

    static String infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                result.append(c);
            }else if (c == '(') {
                stack.push(c);
            }else if (c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }else {
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}
