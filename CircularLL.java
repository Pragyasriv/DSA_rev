public class CircularLL {
    static class Node {
        int data;
        Node next;

        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    static Node insert_in_emptyList(Node last, int new_data) {
        if(last != null) {
            return null;
        }

        Node new_node = new Node(new_data);

        new_node.next = new_node;
        last = new_node;
        return last;
    }

    static Node insert_at_beginning(Node last, int new_data) {
        Node new_node = new Node(new_data);

        if(last == null) {
            new_node.next = new_node;
            return new_node;
        }

        new_node.next = last.next;
        last.next = new_node;

        return last;
    }

    static Node insert_at_end(Node last, int new_data) {
        Node new_node = new Node(new_data);

        if(last == null) {
            new_node.next = new_node;
            return new_node;
        }

        new_node.next = last.next;
        last.next = new_node;
        last = new_node;
        return last;
    }

    static Node insert_at_position(Node last, int new_data, int pos) {
        if(last == null) {
            if(pos < 1) {
                System.out.println("Invalid Position");
                return last;
            }
            Node new_node = new Node(new_data);

            new_node.next = new_node;
            return new_node;
        }

        Node new_node = new Node(new_data);

        Node curr = last.next;

        if(pos == 1) {
            new_node.next = curr;
            last.next = new_node;
            return last;
        }

        for(int i = 1; i < pos - 1; i++) {
            curr = curr.next;
            if (curr == last.next) {
                System.out.println("Invalid position!");
                return last;
            }
        }

        new_node.next = curr.next;
        curr.next = new_node;

        if(curr == last) {
            last = new_node;
        }

        return last;
    }

    public static void find(Node Head, int key) {
        Node temp = Head;

        int count = 0;
        if(Head == null) {
            System.out.println("List is empty");
        }else{
            do {
                if(temp.data == key) {
                    System.out.print("Key is found: " + key);
                    count = 1;
                    break;
                }
                temp = temp.next;
            }while(temp != Head);

            if(count == 0) {
            System.out.println("Key is not found");
            }
        }
    }

    static void printList(Node last) {
        if (last == null) return;

        // Start from the head node
        Node head = last.next;
        while (true) {
            System.out.print(head.data + " ");
            head = head.next;
            if (head == last.next) break;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Insert a node into the empty list
        // last = insert_in_emptyList(last, 1);

        // // Print the list
        // System.out.print("List after insertion: ");
        // printList(last);

        // System.out.println("Original list: ");
        // printList(last);

        // // Insert 5 at the beginning
        // last = insert_at_beginning(last, 5);

        // System.out.print(
        //     "List after inserting 5 at the beginning: ");
        // printList(last);

        Node first = new Node(2);
        first.next = new Node(3);
        first.next.next = new Node(4);

        Node last = first.next.next;
        last.next = first;

        // System.out.print("Original list: ");
        // printList(last);

        // // Insert elements at the end of the circular linked
        // // list
        // last = insert_at_end(last, 5);
        // last = insert_at_end(last, 6);

        // System.out.print("List after inserting 5 and 6: ");
        // printList(last);

        // System.out.print("Original list: ");
        // printList(last);

        // // Insert elements at specific positions
        // int data = 5, pos = 2;
        // last = insert_at_position(last, data, pos);
        // System.out.print("List after insertions: ");
        // printList(last);

        find(first, 3);
    }    
}
