public class reverse {
    Node head;
    public Node reverseLL(Node head) {
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void printLL(Node node) {
        while(node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtRear(10);
        list.insertAtRear(20);
        list.insertAtRear(30);
        list.insertAtRear(40);

        reverse obj = new reverse();
        obj.head = list.head;
        Node reversedHead = obj.reverseLL(obj.head);

        System.out.println("Reversed Linked List:");
        printLL(reversedHead);
    }
}
