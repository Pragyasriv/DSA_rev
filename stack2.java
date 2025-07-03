public class stack2 {
    public class Node{
        int data;
        Node next;

        Node(int new_data) {
            this.data = new_data;
            this.next = null;
        }
    }

    Node Head;

    public stack2() {
        Head = null;
    }

    public boolean isEmpty() {
        return Head == null;
    }

    public void push(int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = Head;
        Head = new_node;
        System.out.println(new_data + " pushed to stack");
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }else {
            Node temp = Head;
            Head = Head.next;
            temp = null;
        }
    }

    public int peek() {
        if(!isEmpty()) {
            return Head.data;
        }else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public static void main(String[] args)
    {
        // Creating a stack
        stack2 st = new stack2();

        // Push elements onto the stack
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);

        // Print top element of the stack
        System.out.println("Top element is " + st.peek());

        // removing two elemements from the top
  		System.out.println("Removing two elements...");
        st.pop();
        st.pop();

        // Print top element of the stack
        System.out.println("Top element is " + st.peek());
    }
}
