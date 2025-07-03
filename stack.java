public class stack {
    int top;
    int maxSize;
    int[] stackArray;

    public stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean push(int x) {
        if(top > maxSize - 1) {
            System.out.println("Stack overflow");
            return false;
        }
        stackArray[++top] = x;
        return true;
    }

    public int pop() {
        if(top < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        return stackArray[top--];
    }

    public int peek() {
        if(top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }

        return stackArray[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }
    public static void main(String[] args) {
        stack s = new stack(5); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        //System.out.println(s.pop() + " popped from stack"); 

        //System.out.println("Top element is: " + s.peek()); 

        // System.out.println("Elements present in stack: "); 
        // while (!s.isEmpty()) { 
        //     System.out.print(s.peek() + " "); 
        //     s.pop(); 
        // } 

        System.out.println(s.push(11) + " Stack after pushing 11 ");
        while (!s.isEmpty()) { 
            System.out.print(s.peek() + " "); 
            s.pop(); 
        } 
    }
}
