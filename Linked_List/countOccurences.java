public class countOccurences {
    Node head;
    public int count(Node head, int key) {
        Node curr = head;
        int count = 0;

        while(curr != null) {
            if(curr.data == key) {
                count++;
            }
            curr = curr.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtRear(10);
        list.insertAtRear(20);
        list.insertAtRear(30);
        list.insertAtRear(10);

        int key = 10;
        countOccurences obj = new countOccurences();
        obj.head = list.head;
        System.out.println(obj.count(obj.head, key));
    }
}
