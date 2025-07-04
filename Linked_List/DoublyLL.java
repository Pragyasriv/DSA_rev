public class DoublyLL {
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int new_data){
            this.data = new_data;
            this.next = null;
            this.prev = null;
        }
    }

    static void itr_forward_traverseList(Node Head) {
        Node curr = Head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static void rec_forward_traverseList(Node Head) {
        if(Head == null) {
            return;
        }else{
            System.out.print(Head.data + " ");
            rec_forward_traverseList(Head.next);
        }
    }

    static void itr_backward_traverseList(Node tail) {
        Node curr = tail;
        while(curr != null) {
            System.out.print(curr.data);
            curr = curr.prev;
        }
        System.out.println();
    }

    static void rec_backward_traverseList(Node tail) {
        if(tail == null) {
            return;
        }else{
            System.out.print(tail.data + " ");
            rec_backward_traverseList(tail.prev);
        }
    }

    static int size_1(Node Head) {
        int count = 0;

        Node curr = Head;
        while(curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    static int size_2(Node Head) {
        Node curr = Head;
        if(curr == null) {
            return 0;
        }else {
            return 1 + size_2(curr.next);
        }
    }

    static Node insert_at_front(Node Head, int new_data) {
        Node new_node = new Node(new_data);

        new_node.prev = null;
        new_node.next = Head;

        if(Head != null) {
            Head.prev = new_node;
        }

        return new_node;
    }

    static Node insert_at_end(Node Head, int new_data) {
        Node new_node = new Node(new_data);

        if(Head == null) {
            Head = new_node;
        }else{
            Node curr = Head;
            while(curr.next != null) {
                curr = curr.next;
            }

            curr.next = new_node;
            new_node.prev = curr;
        }

        return Head;
    }

    static Node insert_at_pos(Node Head, int pos, int new_data) {
        Node new_node = new Node(new_data);

        if(pos == 1) {
            new_node.next = Head;

            if(Head != null) {
                Head.prev = new_node;
            }
            Head = new_node;
            return Head;
        }

        
        Node curr = Head;

        for(int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if(curr == null) {
            System.out.println("Position is out of bounds.");
            return Head;
        }

        new_node.prev = curr;
        new_node.next = curr.next;

        curr.next = new_node;

        if(new_node.next != null) {
            new_node.next.prev = new_node;
        }

        return Head;

    }

    static Node delete_at_first(Node Head) {
        if(Head == null) {
            return null;
        }

        Node temp = Head;

        Head = Head.next;
        if(Head != null) {
            Head.prev = null;
        }

        return Head;

    }

    static Node delete_at_end(Node Head) {
        if(Head == null || Head.next == null) {
            return null;
        }

        Node curr = Head;

        while(curr.next != null) {
            curr = curr.next;
        }
        if(curr.prev != null) {
            curr.prev.next = null;
        }

        return Head;
    }

    public static void printList(Node Head) {
        Node curr = Head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a hardcoded doubly linked list:
        // 1 <-> 2 <-> 3
        Node Head = new Node(1);
        Head.next = new Node(2);
        Head.next.prev = Head;
        Head.next.next = new Node(4);
        Head.next.next.prev = Head.next;

        //System.out.print("Forward Traversal: ");
        //itr_forward_traverseList(Head);
        //rec_forward_traverseList(Head);

        //System.out.print("Backward Traversal: ");
        //itr_backward_traverseList(third);
        //rec_backward_traverseList(third);

        //System.out.println("size = " + size_2(Head));

        // System.out.println("Inserting Node with data 4 at the front: ");
        // int data = 4;
        // Head = insert_at_front(Head, data);

        // // Print the updated list
        // printList(Head);

        // System.out.println(
        //     "Inserting Node with data 4 at the end: ");
        // int data = 4;
        // Head = insert_at_end(Head, data);

        // // Print the updated list
        // printList(Head);

        // System.out.print("Original Linked List: ");
        // printList(Head);

        // System.out.print("Inserting Node with data 3 at position 2: ");
        // int data = 3;
        // int pos = 2;
        // Head = insert_at_pos(Head, pos, data);

        // // Print the updated list
        // printList(Head);

        // System.out.print("After Deletion at the beginning: ");
        // Head = delete_at_first(Head);

        // printList(Head);

        // System.out.print("After Deletion at the end: ");
        // Head = delete_at_end(Head);

        // printList(Head);
    }
}
