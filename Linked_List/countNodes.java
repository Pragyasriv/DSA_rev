public class countNodes {
    Node head;
    public void count() {
        if(head == null) {
            System.out.println("Empty list");
            return;
        }

        Node curr = head;
        int count = 0;
        do{
            curr = curr.next;
            count++;
        }while(curr != head);

        System.out.println(count);
    }

    public static void main(String[] args) {
      	
        CircularLinkedlist cll = new CircularLinkedlist();

        cll.insertAtRear(10);
        cll.insertAtRear(20);
        cll.insertAtBeginning(5);
        cll.insertAfter(15, 10);

        // Create an instance of countNodes and set its head to cll's head
        countNodes cn = new countNodes();
        cn.head = cll.head;
        cn.count();
    }
}
