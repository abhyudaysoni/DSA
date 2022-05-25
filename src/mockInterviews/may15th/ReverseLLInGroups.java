package mockInterviews.may15th;

import java.util.Scanner;

class ReverseLLInGroups {
    Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        ReverseLLInGroups l = new ReverseLLInGroups();

        l.push(9);
        l.push(8);
        l.push(7);
        l.push(6);
        l.push(5);
        l.push(4);
        l.push(3);
        l.push(2);
        l.push(1);

        l.display();

        l.head = l.reverseInGroups(l.head, k);

        System.out.println("Reversed list");
        l.display();
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverseInGroups(Node head, int k) {
        if (head == null)
            return null;
        Node current = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null)
            head.next = reverse(next, k);
        return prev;
    }

    public void push(int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}