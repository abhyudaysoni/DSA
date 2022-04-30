package dsa.stacks.assignments.inProgress;

public class StackImplementationUsingLinkedList {
    Node top = null;

    public static void main(String[] args) {

    }

    public void push(int x) {

        Node node = new Node(x);
        if (this.top == null) {
            this.top = node;
        } else {
            Node i = this.top;
            while (i.next != null) {
                i = i.next;
            }
            i.next = node;
        }
    }

    public void pop() {

        if (this.top == null) {
            System.out.println(0);
        } else {
            Node i = this.top;
            while (i.next.next != null) {
                i = i.next;
            }
            i.next = null;
            System.out.println(i.val);
        }
    }

    public void top() {

        int peeked = 0;
        if (this.top == null) {
            System.out.println(0);
            return;
        } else if (this.top.next == null) {
            System.out.println(top);
            return;
        } else {
            Node i = this.top;
            while (i.next != null) {
                i = i.next;
            }
            peeked = i.val;
        }
        System.out.println(peeked);
    }

    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;

        }
    }
}
