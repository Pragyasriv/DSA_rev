public class singlyToCircular {
    Node head;

    public void circular(Node head) {
        this.head = head;
        Node current = head;

        if (current == null) return;

        while (current.next != null) {
            current = current.next;
        }

        current.next = head;
    }
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
      	
        singlyToCircular list = new singlyToCircular();

        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(14);
        head.next.next.next = new Node(16);
        
        list.circular(head);

        list.display();
    }
}
