package dsa.linkedList.assignments.completed;

import java.util.Scanner;

public class Adding1ToTheLinkedList {
    static int size = 0;
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = num; i >= 1; i = i / 10) {
            int r = i % 10;
            addLast(r);
        }
        display(head);
        addOne(head);
        display(head);
    }

    static Node addOne(Node head) {
        boolean carry = false;
        Node i = head;
        while (i != null) {
            if (i.data < 9) {
                carry = false;
                i.data = i.data + 1;
                break;
            }
            if (i.data == 9) {
                i.data = 0;
                carry = true;
                i = i.next;
            }
        }
        if (carry) {
            addLast(1);
        }
        return head;
    }

    static Node addLast(int data) {
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
        size++;
        return head;
    }

    static void display(Node head) {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node i = head;
        while (i != null) {
            System.out.print(i.data + "->");
            i = i.next;
        }
        System.out.println("null           Size: " + size);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}


/*

package dsa1.linkedList.assignments.inProgress;

import java.util.Scanner;

public class Adding1ToTheLinkedList {
    static int size = 0;
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = num; i >= 1; i = i / 10) {
            int r = i % 10;
            addLast(r);
        }
        display(head);
        addOne(head);
        display(head);
    }

    static Node addOne(Node head) {
        Node i = head;
        int count = 1;
        while (i != null) {
            if (i.data < 9) {
                i.data = i.data + 1;
                break;
            } else if (count == size && i.data == 9) {
                addLast(0);
            } else {
                i.data = 0;
                i = i.next;
                count++;
            }
        }
        return head;
    }

    static Node addLast(int data) {
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
        size++;
        return head;
    }

    static int getSize(Node head) {
        int size = 0;
        Node i = head;
        while (i != null) {
            i = i.next;
            size++;
        }
        return size;
    }

    static void display(Node head) {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node i = head;
        while (i != null) {
            System.out.print(i.data + "->");
            i = i.next;
        }
        System.out.println("null           Size: " + size);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}






 */



/*
package dsa1.linkedList.assignments.inProgress;

import java.util.Scanner;

public class Adding1ToTheLinkedList {
    static int size = 0;
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = num; i >= 1; i = i / 10) {
            int r = i % 10;
            addLast(r);
        }
        display(head);
        addOne(head);
        display(head);
    }

    static Node addOne(Node head) {

        int sum = 0;
        Node i = head;
        while (i != null) {
            sum = 10 * sum + i.data;
            i = i.next;
        }
        sum = sum + 1;
        System.out.println(sum);
        head = null;
        for (int j = 0; j < size; j++) {
            int r = sum % 10;
            sum = sum / 10;
            update(j, r);
        }
        return head;
    }

    static Node update(int idx, int r) {
        Node i = head;
        int j = 0;
        while (j <= idx) {
            if (j == idx) {
                i.data = r;
            }
            i = i.next;
            j++;
        }
        return null;
    }

    static Node addLast(int data) {
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
        size++;
        return head;
    }

    static void display(Node head) {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node i = head;
        while (i != null) {
            System.out.print(i.data + "->");
            i = i.next;
        }
        System.out.println("null           Size: " + size);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}






 */