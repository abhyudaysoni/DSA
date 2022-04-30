package dsa.linkedList.assignments.completed;

public class DeletionFromEndInDLL {
    Node head;

    public static void main(String[] args) {

    }

    void delete(Node node) {
        Node p = node.prev;
        Node n = node.next;
        p.next = n;
        n.prev = p;
    }

    Node deleteElement(Node head, int k) {
        Node node = kthFromLast(head, k);
        Node next = head.next;
        delete(node);
        return node == head ? next : head;
    }

    Node kthFromLast(Node head, int k) {
        Node s = head;
        Node f = head;

        while (k > 1) {
            f = f.next;
            k--;
        }
        while (f.next != null) {
            f = f.next;
            s = s.next;
        }
        return s;
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
