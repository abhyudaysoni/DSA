package dsa.linkedList.assignments.completed;

public class ReversingADLL {
    Node head;

    public static void main(String[] args) {
    }


    Node reverse(Node head) {
        Node prev = head.prev;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }
}
