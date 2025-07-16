import java.util.Stack;

public class reverseStack {
    public static void insertAtBottom(Stack<Integer> s, int x) {
        if(s.isEmpty()) {
            s.push(x);
        }else {
            int a = s.pop();
            insertAtBottom(s, x);
            s.push(a);
        }
    }

    public static void reverse(Stack<Integer> s) {
        if(!s.isEmpty()) {
            int x = s.pop();
            reverse(s);
            insertAtBottom(s, x);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        reverse(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
