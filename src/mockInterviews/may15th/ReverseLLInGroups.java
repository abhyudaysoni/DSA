package mockInterviews.may15th;

import java.util.Scanner;

public class ReverseLLInGroups {
    Node head;

    public static void main(String[] args) {
        ReverseLLInGroups re = new ReverseLLInGroups();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        re.addLast(2);
        re.addLast(4);
        re.addLast(6);
        re.addLast(8);
        re.addLast(10);
        re.addLast(12);
        re.addLast(14);
        re.addLast(16);
        re.addLast(18);
        re.addLast(20);
        re.display();
        re.reverseLLinGroups(re.head, k);
        re.display();
    }

    void addLast(int val) {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }

    void display() {
        if (head == null) {
            System.out.println("Empty List");
        } else {
            Node i = head;
            while (i != null) {
                System.out.print(i.data + "->");
                i = i.next;
            }
            System.out.println();
        }
    }

    Node reverseLLinGroups(Node head, int k) {
        if (head == null) {
            return null;
        }
        int count = 0;
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            head.next = reverseLLinGroups(next, k);
        }
        return prev;
    }

    class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            next = null;
        }
    }
}
