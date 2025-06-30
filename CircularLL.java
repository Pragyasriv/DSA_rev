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
        Node last = null;

        // Insert a node into the empty list
        last = insert_in_emptyList(last, 1);

        // Print the list
        System.out.print("List after insertion: ");
        printList(last);
    }
    
}