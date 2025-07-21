public class Stack {

    private Node head;
    private int size = 0;
    private final int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
    }

    public void push(int newData) {
        if (size == maxSize) {
            System.out.println("Stack Overflow: Cannot push " + newData + " (stack is full)");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println(newData);
    }

    public void pop() {
        if (head == null) {
            System.out.println("Stack underflow: Stack is empty, cannot pop");
            return;
        }
        int poppedData = head.data;
        head = head.next;
        size--;
        System.out.println(poppedData);
    }

    public void printStack() {
        if (head == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        // Stack stack = new Stack(3);
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.printStack();

        // stack.pop();
        // stack.printStack();
    }
}