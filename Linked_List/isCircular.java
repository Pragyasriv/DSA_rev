public class isCircular {
    Node head;
    static boolean circular(Node head) {
        if(head == null) {
            return true;
        }
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    public static void main(String[] args) {
      	
      	CircularLinkedlist cll = new CircularLinkedlist();

        cll.insertAtRear(10);
        cll.insertAtRear(20);
        cll.insertAtBeginning(5);
        cll.insertAfter(15, 10);

        System.out.println(circular(cll.head));
    }
}
