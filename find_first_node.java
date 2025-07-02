import java.util.HashSet;

public class find_first_node {
    static class Node {
        int data;
        Node next;

        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    static Node first_node(Node Head) {
        HashSet<Node> visited = new HashSet<>();

        Node curr = Head;

        while(curr != null) {
            if(visited.contains(curr)) {
                return curr;
            }

            visited.add(curr);
            curr = curr.next;
        }
        return null;
    }

    static Node first_node_floyds(Node Head) {
        Node slow = Head;
        Node fast = Head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                slow = Head;

                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
      
        // Create a linked list: 10 -> 15 -> 4 -> 20
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        head.next.next.next.next = head;

        Node firstNode = first_node(head);

        if (firstNode != null)
            System.out.println(firstNode.data);
        else
            System.out.println(-1);
    }
}