public class Main {
    public static void main(String[] args) {

        System.out.println("Linked List:");
        LinkedList list = new LinkedList();
        list.insertAtRear(10);
        list.insertAtRear(20);
        list.insertAtRear(30);
        list.printList();

        list.insertAtPosition(15, 1);
        list.printList();

        list.deleteAtRear();
        list.printList(); 

        list.deleteAtPosition(1);
        list.printList();

        System.out.println("Stack:");
        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        stack.pop();
        stack.printStack();

        System.out.println("Queue:");
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();


        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.dequeue();
    }
}
