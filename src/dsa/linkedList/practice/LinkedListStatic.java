package dsa.linkedList.practice;

public class LinkedListStatic {
    static Node head;
    int size = 0;

    public static void main(String[] args) {
        LinkedListStatic list = new LinkedListStatic();
        for (int i = 0; i < 5; i++) {
            addLast(i);
        }
        display(head);
    }

    static void display(Node head) {
        if (head == null) {
            System.out.println("Empty list");
        }
        Node i = head;
        while (i != null) {
            System.out.print(i.data + "->");
            i = i.next;
        }
    }

    static void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node i = head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = node;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
