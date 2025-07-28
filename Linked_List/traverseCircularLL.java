public class traverseCircularLL {
    Node head;
    public void display() {
        if(head == null) {
            System.out.println("Empty list");
            return;
        }

        Node curr = head;
        do{
            System.out.println(curr.data + " -> ");
            curr = curr.next;
        }while(curr != head);
        System.out.println("back to head");
    }

    public static void main(String[] args) {
      	
      	CircularLinkedlist cll = new CircularLinkedlist();

        cll.insertAtRear(10);
        cll.insertAtRear(20);
        cll.insertAtBeginning(5);
        cll.insertAfter(15, 10);

        cll.display();
    }
}
