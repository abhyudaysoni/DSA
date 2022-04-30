package dsa.linkedList.assignments.completed;

import java.util.Scanner;

public class MergeTwoSortedLinkedLists {
    Node head = null;
    int size = 0;
    Node resHead;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MergeTwoSortedLinkedLists l1 = new MergeTwoSortedLinkedLists();
        int n1 = sc.nextInt();
        int val = 0;
        for (int i = 0; i < n1; i++) {
            val = sc.nextInt();
            l1.addLast(val);
        }
        l1.display();
        MergeTwoSortedLinkedLists l2 = new MergeTwoSortedLinkedLists();
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            val = sc.nextInt();
            l2.addLast(val);
        }
        l2.display();
        MergeTwoSortedLinkedLists res = new MergeTwoSortedLinkedLists();
        res.merge(l1.getHead(), l2.getHead());
        res.display();
    }

    Node getHead() {
        return this.head;
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

    MergeTwoSortedLinkedLists merge(Node h1, Node h2) {
        Node i = h1;
        Node j = h2;
        while (i != null && j != null) {
            if (i.data < j.data) {
                this.addLast(i.data);
                i = i.next;
            } else {
                this.addLast(j.data);
                j = j.next;
            }

        }
        while (i != null) {
            this.addLast(i.data);
            i = i.next;

        }
        while (j != null) {
            this.addLast(j.data);
            j = j.next;

        }
        return this;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
