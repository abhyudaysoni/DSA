package mockInterviews.may15th;

import java.util.Scanner;

public class AddListsAsNumbers {
    Node head;
    int size;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        AddListsAsNumbers l1 = new AddListsAsNumbers();
        AddListsAsNumbers l2 = new AddListsAsNumbers();
        AddListsAsNumbers res = new AddListsAsNumbers();
        for (int i = num1; i >= 1; i = i / 10) {
            int r = i % 10;
            l1.addFirst(r);
        }
        for (int i = num2; i >= 1; i = i / 10) {
            int r = i % 10;
            l2.addFirst(r);
        }

        balanceList(l1, l2);
        l1.display();
        l2.display();
        res.addLists(l1.head, l2.head, res);
        res.addFirst(0);
        res.display();
    }

/*

9878684
58498

*/

    int addLists(Node h1, Node h2, AddListsAsNumbers res) {
        Node i = h1;
        Node j = h2;
        int carry = 0;
        if (i.next == null || j.next == null) {
            int sum = i.data + j.data;
            sum = sum % 10;
            return sum;
        }
        int sum = carry + i.data + j.data;
        int r = 0;
        if (sum > 9) {
            for (int k = sum; k >= 1; k = k / 10) {
                r = k % 10;
            }
            carry = r;
            sum = sum % 10;
        }
        res.addFirst(addLists(i.next, j.next, res));
        return sum + carry;
    }

    static void balanceList(AddListsAsNumbers l1, AddListsAsNumbers l2) {
        if (l1.size > l2.size) {
            int diff = l1.size - l2.size;
            for (int i = 0; i <= diff; i++) {
                l2.addFirst(0);
            }
            l1.addFirst(0);
        } else {
            int diff = l2.size - l1.size;
            for (int i = 0; i <= diff; i++) {
                l1.addFirst(0);
            }
            l2.addFirst(0);
        }
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

    void getSize() {
        System.out.println("Size: " + size);
    }

    void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
        }
    }
}
