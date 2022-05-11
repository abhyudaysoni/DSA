package mockInterviews;

public class ReversingALinkedList {
    static Node head;

    public static void main(String[] args) {
        ReversingALinkedList ll = new ReversingALinkedList();
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(6);
        ll.addLast(1);

        ll.display();
        head = reversing();
        System.out.println();
        ll.display();
    }

    static Node reversing() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    Node addLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node i = head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = node;
            i = node.prev;
        }
        return node;
    }

    void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            this.data = val;
        }
    }
}

