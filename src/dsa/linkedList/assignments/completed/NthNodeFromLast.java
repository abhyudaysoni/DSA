package dsa.linkedList.assignments.completed;

import java.util.Scanner;

public class NthNodeFromLast {
    Node head;
    int size;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NthNodeFromLast list = new NthNodeFromLast();
        int l = sc.nextInt();
        int nth = sc.nextInt();
        int val = 0;
        for (int i = 0; i < l; i++) {
            val = sc.nextInt();
            list.addLast(val);
        }
        list.display();
        System.out.println(list.nthNode(nth));
    }

    Node addLast(int data) {
        Node node = new Node(data);
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
        return node;
    }

    int nthNode(int n) {
        int size2 = getSize(head);
        Node temp = this.head;
        int i = 0;
        while (i <= size2 - n) {
            temp = temp.next;
            i++;
        }
        return temp.data;
    }

    Node display() {
        if (this.head == null) {
            System.out.println("Empty List");
        }
        Node i = this.head;
        while (i != null) {
            System.out.print(i.data + "->");
            i = i.next;

        }
        System.out.println("null        Size: " + this.size);
        return null;
    }

    int getSize(Node head) {
        int size = 0;
        Node node = head;
        while (node.next != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

}
