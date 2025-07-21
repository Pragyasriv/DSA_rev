public class Queue {

    private Node head;

    public void enqueue(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            System.out.println(newData);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        System.out.println(newData);
    }

    public void dequeue() {
        if(head == null) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        int dequeued_data = head.data;
        head = head.next;
        System.out.println(dequeued_data);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = head;
        System.out.print("Current Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Queue q = new Queue();

        // q.enqueue(10);
        // q.enqueue(20);

        // q.dequeue();
        // q.dequeue();
        // q.dequeue();
        // q.dequeue();
        // q.dequeue();


        // q.enqueue(30);
        // q.enqueue(40);
        // q.enqueue(50);

        // q.dequeue();
    }
}