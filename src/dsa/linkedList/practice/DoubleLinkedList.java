package dsa.linkedList.practice;

public class DoubleLinkedList {
    Node head;
    int size;

    DoubleLinkedList() {
        this.size = 0;
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertAtFirst(2);
        dll.insertAtFirst(4);
        dll.insertAtFirst(6);
        dll.insertAtFirst(8);
        dll.insertAtFirst(20);
        dll.insertAtFirst(12);
        dll.display();
        dll.delete(4);
        dll.display();

    }

    public static Node Reverse(Node head) {
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

    Node insertAtFirst(int k) {

        Node node = new Node(k);
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        return head;
    }

    void display() {
        Node i = head;
        while (i != null) {
            System.out.print(i.data + "->");
            i = i.next;
        }
        System.out.println();
    }

    Node insertAtIndex(int data, int idx) {
        if (idx == 1) return insertAtFirst(data);
        Node node = new Node(data);
        Node temp = head;
        while (idx > 1) {
            temp = temp.next;
            idx--;
        }
        Node prev = temp.prev;
        node.next = temp;
        node.prev = temp.prev;
        prev.next = node;
        temp.prev = node;
        return head;
    }

    Node delete(int k) {
        int count = 0;
        Node i = head;
        while (count < k) {
            i = i.next;
            count++;
        }
        i.prev.next = i.next;
        i.next.prev = i.prev;
        return i;
    }

    int getSize(Node head) {
        int size = 0;
        Node i = head;
        while (i.next != null) {
            size++;
            i = i.next;
        }
        return size;
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
