package dsa.linkedList.assignments.completed;

public class MakeItCircular {
    public static void main(String[] args) {
        Node h1 = new Node();
        for (int i = 1; i < 5; i++) {
            addLast(h1, i);
        }
        display(h1);
    }

    static void addLastInCircular(Node head, int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
        }
        Node i = head;
        while (i.next != null) {
            i = i.next;
        }
        i.next = node;
    }

    static Node makeItCircular(Node head) {
        Node i = head;
        while (i.next != null) {
            i = i.next;
        }
        i.next = head;
        return head;
    }

    static void display(Node head) {
        if (head == null) {
            System.out.println("Empty List");
        } else {
            Node i = head;
            while (i.next != null) {
                System.out.print(i.data + "->");
                i = i.next;
            }
            System.out.println("null");
        }
    }

    static Node addLast(Node head, int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
        } else {
            Node i = head;
            while (i.next != head) {
                i = i.next;
            }
            i.next = node;
            node.next = head;
        }
        return head;
    }

    static class Node {
        int data;
        Node next;
    }
}
