public class LinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int new_data){
            this.data = new_data;
            this.next = null;
        }
    }

    public static void traverseList(Node Head){
        while(Head != null) {
            System.out.print(Head.data + " ");
            Head = Head.next;
        }
        System.out.println();
    }

    static boolean searchKey(Node Head, int key){
        Node curr = Head;
        while(curr != null){
            if(curr.data == key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    static int countNodes(Node Head){
        int count = 0;

        Node curr = Head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    static Node insert_at_front(Node Head, int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = Head;
        return new_node;
    }

    static Node insert_at_end(Node Head, int new_data) {
        Node new_node = new Node(new_data);

        if(Head == null) {
            return new_node;
        }

        Node last = Head;

        while(last.next != null) {
            last = last.next;
        }

        last.next = new_node;

        return Head;
    }

    static Node insert_at_position(Node Head, int pos, int new_data) { 
        if(pos < 0) {
            return Head;
        } 
        
        if(pos == 1) {
            Node new_node = new Node(new_data);
            new_node.next = Head;
            return new_node;
        }

        Node curr = Head;

        for(int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if(curr == null) {
            return Head;
        }

        Node new_node = new Node(new_data);
        new_node.next = curr.next;
        curr.next = new_node;
        return Head;
    }

    static Node delete_at_first(Node Head) {
        if(Head == null) {
            return null;
        }

        Node temp = Head;
        Head = Head.next;
        temp = null;
        return Head;
    }

    static Node delete_at_end(Node Head) {
        if(Head == null || Head.next == null) {
            return null;
        }

        Node temp = Head;

        while(temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return Head;
    }

    static Node delete_at_position(Node Head, int pos) {
        Node temp = Head;
        Node prev = null;
        
        if(temp == null) {
            return null;
        }

        if(pos == 1) {
            Head = temp.next;
            return Head;
        }

        for(int i = 1; temp != null & i < pos; i++) {
            prev = temp;
            temp = temp.next;
        }

        if(temp != null) {
            prev.next = temp.next;
        }else{
            System.out.println("Position " + pos + " does not exist in the list.");
        }

        return Head;
    }

    static void printNode(Node Head) {
        Node curr = Head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    static Node reverse_List(Node Head) {
        Node prev = null;
        Node curr = Head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }

    public static void main(String args[]){
        Node Head = new Node(14);
        Head.next = new Node(21);
        Head.next.next = new Node(13);
        Head.next.next.next = new Node(30);
        Head.next.next.next.next = new Node(10);

        //traverseList(Head);

        // int key = 14;

        // if(searchKey(Head, key)){
        //     System.out.println("Key " + key + " found in the list.");
        // } else {
        //     System.out.println("Key " + key + " not found in the list.");   
        // }

        // countNodes(Head);
        // System.out.println("Number of nodes in the list: " + countNodes(Head));

        System.out.print("Created Linked list is:");
        printNode(Head);

        // System.out.println("After inserting Nodes at the front:");
        // int new_data = 1;

        // Head = insert_at_front(Head, new_data);
        // printNode(Head);

        // System.out.println("After inserting Nodes at the end:");
        // int new_data = 35;

        // Head = insert_at_end(Head, new_data);
        // printNode(Head);

        // System.out.println("After inserting Nodes at the pos:");
        // int new_data = 7; int pos = 3;

        // Head = insert_at_position(Head, pos, new_data);
        // printNode(Head);

        // Head = delete_at_first(Head);
        // printNode(Head);

        // Head = delete_at_end(Head);

        // System.out.println(
        //     "List after removing the last node: ");
            
        // printNode(Head);

        // int position = 2;
        // Head = delete_at_position(Head, position);

        // // Print list after deletion
        // System.out.print("List after deletion: ");
        // printNode(Head);

        Head = reverse_List(Head);
        System.out.println("Reversed Linked list is:");
        printList(Head);
    }
}
