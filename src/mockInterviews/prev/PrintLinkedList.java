package mockInterviews.prev;

import java.util.Scanner;

public class PrintLinkedList {
    Node head;

    public static void main(String[] args) {
        PrintLinkedList print = new PrintLinkedList();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            print.push(val);
        }

        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());
        System.out.println("print.pop() = " + print.pop());

    }

    void addLast(char val) {
        Node node = new Node(val);
        if (this.head == null) {
            head = node;
        } else {
            Node i = this.head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = node;
        }
    }

    void push(char val) {
        Node node = new Node(val);
        if (this.head == null) {
            head = node;
        } else {
            Node i = this.head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = node;
        }
    }

    char pop() {
        char popped = 'O';
        if (this.head.next == null) {
            popped = this.head.data;
            this.head.data = '0';
            return popped;
        } else if (this.head == null) {
            System.out.println("Empty stack");
            return 'O';
        } else {
            Node i = this.head;
            while (i.next.next != null) {
                i = i.next;
            }
            popped = i.next.data;
            i.next = null;
        }
        return popped;
    }

    char peek() {
        char peeked = 'O';
        if (this.head == null) {
            System.out.println("Empty stack");
            return 'O';
        } else {
            Node i = this.head;
            while (i.next.next != null) {
                i = i.next;
            }
            peeked = i.next.data;
        }
        return peeked;
    }

    void display() {
        if (this.head == null) {
            System.out.println("Empty List");
        } else {
            Node i = this.head;
            while (i != null) {
                System.out.print(i.data);
                i = i.next;
            }
        }
    }

    class Node {
        char data;
        Node next;

        Node(char val) {
            this.data = val;
        }
    }
}
