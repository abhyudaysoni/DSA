package dsa.linkedList.assignments.completed;

import java.util.Scanner;

public class AddTwoListsAsNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node h1 = new Node();
        Node h2 = new Node();

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = num1; i >= 1; i = i / 10) {
            int r = i % 10;
            addLast(h1, r);
//            System.out.println("h1: " + r);
//            System.out.println("h1.data in main: " + h1.data);
        }
        for (int i = num2; i >= 1; i = i / 10) {
            int r = i % 10;
            addLast(h2, r);
//            System.out.println("h2: " + r);
//            System.out.println("h2.data int main: " + h2.data);
        }

        display(h1);
        display(h2);

        display(addNumber(h1, h2));
    }

    static void addLast(Node head, int data) {
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

    static Node addNumber(Node first, Node second) {
        Node h3 = new Node(0);
        Node i = first.next;
        Node j = second.next;
        boolean carry = false;
        int res;
        while (i != null && j != null) {
            if (carry) {
                res = (i.data + j.data + 1);
            } else {
                res = i.data + j.data;
            }
            if (res > 9) {
                res = res % 10;
                carry = true;
            } else {
                carry = false;
            }
            addLast(h3, res);
            i = i.next;
            j = j.next;
        }
        while (j != null) {
            if (carry) {
                res = (j.data + 1);
            } else {
                res = j.data;
            }
            if (res > 9) {
                res = res % 10;
                carry = true;
            } else {
                carry = false;
            }
            addLast(h3, res);
            j = j.next;
        }
        while (i != null) {
            if (carry) {
                res = (i.data + 1);
            } else {
                res = i.data;
            }
            if (res > 9) {
                res = res % 10;
                carry = true;
            } else {
                carry = false;
            }
            addLast(h3, res);
            i = i.next;
        }
        if (carry) {
            addLast(h3, 1);
        }
        return h3.next;
    }

    static void display(Node head) {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
//        System.out.println("display(): " + head.data);
        Node i = head;
        while (i != null) {
            System.out.print(i.data + "->");
            i = i.next;
        }
        System.out.println();
    }

    static class Node {
        int data;
        Node next;

        Node() {
        }

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
