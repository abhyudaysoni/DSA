package dsa.queues;

public class QueueUsingLinkedList {
    Node head;
    int size;

    public static void main(String[] args) {
        QueueUsingLinkedList q1 = new QueueUsingLinkedList();
        q1.addBack(10);
        q1.addBack(20);
        System.out.println(q1.removeFirst());
        q1.addBack(30);
        q1.addFront(40);
        q1.addBack(50);
        q1.addFront(60);
        q1.addBack(70);
        System.out.println(q1.removeLast());
        q1.display();
        System.out.println(q1.peekFirst());
        System.out.println(q1.peekLast());
    }

    void addFront(int val) {
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;
        this.size++;
    }

    void display() {
        if (this.head == null) {
            System.out.println("Empty Queue");
        } else {
            Node i = this.head;
            while (i != null) {
                System.out.print(i.data + "->");
                i = i.next;
            }
            System.out.println("null        Size: " + this.size);
        }
    }

    void addBack(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
        } else {
            Node i = this.head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = node;
        }
        this.size++;
    }

    int removeLast() {
        if (this.head == null) {
            System.out.println("Empty Queue");
        }
        Node i = this.head;
        while (i.next.next != null) {
            i = i.next;
        }
        int deletedData = i.next.data;
        i.next = null;
        this.size--;
        return deletedData;
    }

    int removeFirst() {
        if (this.head == null) {
            System.out.println("Empty Queue");
        }
        int deletedData = this.head.data;
        this.head = head.next;
        this.size--;
        return deletedData;
    }

    int peekFirst() {
        if (this.head == null) {
            System.out.println("Empty Queue");
        }
        return this.head.data;
    }

    int peekLast() {
        if (this.head == null) {
            System.out.println("Empty Queue");
        }
        Node i = this.head;
        while (i.next != null) {
            i = i.next;
        }
        return i.data;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
