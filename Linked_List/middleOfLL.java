public class middleOfLL {
    Node head;
    public int findLength(Node head) {
        int length = 0;

        while(head != null){
            length++;
            head = head.next;
        }

        return length;
    }

    public int getMid(Node head) {
        int length = findLength(head);

        int mid = length/2;

        while(mid > 0) {
            head = head.next;
            mid--;
        }
        return head.data;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtRear(10);
        list.insertAtRear(20);
        list.insertAtRear(30);
        list.printList();

        middleOfLL obj = new middleOfLL();
        obj.head = list.head;
        obj.getMid(obj.head);

        System.out.println(obj.getMid(obj.head));
    }
}
