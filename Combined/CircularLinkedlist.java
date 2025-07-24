public class CircularLinkedlist {
    public Node head;
    public Node tail;

    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }else {
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }
    }

    public void insertAtRear(int newData) {
        Node newNode = new Node(newData);

        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void insertAfter(int newData, int key) {
        if(head == null) return;
        Node curr = head;

        do{
            if(curr.data == key) {
                Node newNode = new Node(newData);
                newNode.next = curr.next;
                curr.next = newNode;
                if(curr == tail) {
                    tail = newNode;
                }
                return;
            }curr = curr.next;
        } while (curr != head);

        System.out.println("key not found");
    }

    public void delete(int key) {
        if(head == null) return;

        if(head == tail && head.data == key) {
            head = tail = null;
            return;
        }

        Node curr = head, prev = null;

        do{
            if(curr.data == key) {
                if(curr == head) {
                    head = head.next;
                    tail.next = null;
                } else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while(curr != head);

        System.out.println("key not found");
    }

    public boolean search(int key) {
        if(head == null) return false;
        Node curr = head;

        do{
            if(curr.data == key) {
                return true;
            }
            curr = curr.next;
        } while(curr != head);

        return false;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CircularLinkedlist cll = new CircularLinkedlist();

        cll.insertAtRear(10);
        cll.insertAtRear(20);
        cll.insertAtBeginning(5);
        cll.insertAfter(10, 15);
        cll.display(); // Output: 5 -> 10 -> 15 -> 20 -> (back to head)

        cll.delete(15);
        cll.display(); // Output: 5 -> 10 -> 20 -> (back to head)

        System.out.println("Is 10 in list? " + cll.search(10)); // true
        System.out.println("Is 15 in list? " + cll.search(15)); // false
    }
}