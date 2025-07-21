public class sumOfTwoLinkedList {

    public static LinkedList sumLists(LinkedList l1, LinkedList l2) {
        LinkedList result = new LinkedList();
        Node pointer1 = l1.head;
        Node pointer2 = l2.head;
        int carry = 0;

        while (pointer1 != null || pointer2 != null || carry > 0) {
            int sum = carry;
            if (pointer1 != null) {
                sum += pointer1.data;
                pointer1 = pointer1.next;
            }
            if (pointer2 != null) {
                sum += pointer2.data;
                pointer2 = pointer2.next;
            }
            carry = sum / 10;
            result.insertAtRear(sum % 10);
        }
        
        return result;
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertAtRear(2);
        list1.insertAtRear(5);
        list1.insertAtRear(6);

        LinkedList list2 = new LinkedList();
        list2.insertAtRear(7);
        list2.insertAtRear(9);
        list2.insertAtRear(3);

        LinkedList result = sumLists(list1, list2);
        result.printList();
    }
}