public class LinkedList {
    public Node head;

    public void insertAtRear(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void insertAtPosition(int newData, int position) {
        Node newNode = new Node(newData);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curr = head;
        for (int i = 0; i < position - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null){
            System.out.println("Insertion failed: position " + position + " is out of bounds.");
            return;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void deleteAtRear() {
        if (head == null) {
            System.out.println("Deletion failed: list is empty.");
            return;
        }
        if(head.next == null){
            System.out.println("Deleted " + head.data + " from rear (only element).");
            head = null;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    public void deleteAtPosition(int position) {
        if (head == null || position < 0){
            System.out.println("Deletion failed: list is empty.");
            return;
        };
        if (position == 0) {
            head = head.next;
            return;
        }
        Node curr = head;
        for (int i = 0; i < position - 1 && curr != null && curr.next != null; i++) {
            curr = curr.next;
        }
        if (curr == null || curr.next == null){
            System.out.println("Deletion failed: position " + position + " is out of bounds.");
            return;
        };
        curr.next = curr.next.next;
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // LinkedList list = new LinkedList();
        // list.insertAtRear(10);
        // list.insertAtRear(20);
        // list.insertAtRear(30);
        // list.printList();

        // list.insertAtPosition(15, 1);
        // list.printList();

        // list.deleteAtRear();
        // list.printList(); 

        // list.deleteAtPosition(1);
        // list.printList();
    }
}