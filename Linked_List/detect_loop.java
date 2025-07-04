import java.util.HashSet;

public class detect_loop {
    static class Node {
        int data;
        Node next;

        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    static boolean detectLoop(Node Head) {
        HashSet<Node> visited = new HashSet<>();

        while(Head != null) {
            if(visited.contains(Head)) {
                return true;
            }else {
                visited.add(Head);
                Head = Head.next;
            }
        }
        return false;
    }

    static boolean detectLoopFloyds(Node Head) {
        Node slow = Head;
        Node fast = Head;

        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        // Create a loop
        head.next.next.next = head.next;

        if (detectLoopFloyds(head))
            System.out.println("true");
        else
            System.out.println("false");
    }
}