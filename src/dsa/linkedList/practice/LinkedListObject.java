package dsa.linkedList.practice;

import java.util.HashMap;

public class LinkedListObject {
    Node head;
    int size;

    public LinkedListObject() {
        this.size = 0;
    }

    public static void main(String[] args) {
        LinkedListObject List1 = new LinkedListObject();
        for (int i = 1; i < 10; i++) {
            List1.addLast(i);
        }
        List1.checkLoop();
    }

    //Checking if the Linked List is a loop
    boolean checkLoop() {
        boolean res = false;
        HashMap<Node, Integer> hm = new HashMap<>();
        Node i = head;
        int fq;
        while (i != null) {
            fq = hm.getOrDefault(i, 0);
            if (fq > 1) {
                res = true;
                return res;
            } else {
                hm.put(i, fq + 1);
            }
            i = i.next;
        }
        return res;
    }

    //Reversing a Linked List
    Node reverseLL() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    //displaying the linked list
    void display() {
        if (this.size == 0) {
            System.out.println("Empty List");
            return;
        }
        Node i = this.head;
        while (i != null) {
            System.out.print(i.data + "->");
            i = i.next;
        }
        System.out.println("end        Size: " + getSize());
    }

    int getSize() {
        return this.size;
    }

    //adding at first index
    Node addFirst(int data) {
        System.out.println("Adding " + data + " at first: ");
        Node node = new Node(data);
        if (this.head != null) {
            node.next = this.head;
        }
        this.head = node;
        size++;
        return node;
    }

    //adding at given index
    Node addAt(int idx, int data) {
        if (idx < 0 || idx > this.size) {
            System.out.println("Invalid index");
        }
        if (idx == 0 && size == 0) {
            addFirst(data);
        }
        System.out.println("Adding " + data + " at index: " + idx);
        int i = 0;
        Node node = this.head;
        while (i < idx - 1) {
            i++;
            node = node.next;
        }
        Node newNode = new Node(data);
        newNode.next = node.next;
        node.next = newNode;
        size++;
        return newNode;
    }

    //adding at last index
    Node addLast(int data) {
        Node node = new Node(data);
        System.out.println("Adding " + data + " at last: ");
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

    //removing from first index
    Node removeFirst() {
        Node ans = this.head;
        if (this.size == 0) {
            System.out.println("Empty List");
            return null;
        } else if (this.size == 1) {
            this.head = null;
            this.size--;
            return ans;
        }
        System.out.println("Removing from first");
        this.head = head.next;
        size--;
        return ans;
    }

    //removing from given index
    Node removeFrom(int idx) {
        if (idx < 0 || idx > this.size) {
            System.out.println("Invalid Index");
            return null;
        }
        System.out.println("Removing from index " + idx + ": ");
        Node node = this.head;
        Node temp = head.next;
        int i = 0;
        while (i < idx - 1) {
            i++;
            temp = temp.next;
            node = node.next;
        }
        node.next = temp.next;
        size--;
        return null;
    }

    //removing from last index
    Node removeLast() {
        if (this.size == 0) {
            System.out.println("Empty List");
            return null;
        } else if (this.size == 1) {
            Node ans = this.head;
            this.head = null;
            this.size--;
            return ans;
        }
        System.out.println("Removing from last: ");
        int i = 0;
        Node secondLast = this.head;
        while (i < this.size - 2) {
            i++;
            secondLast = secondLast.next;
        }
        Node ans = secondLast.next;
        secondLast.next = null;
        this.size--;
        return ans;
    }

    //updating data at given index
    Node updateDataAt(int idx, int data) {
        System.out.println("Updating data " + data + " at index: " + idx);
        if (idx < 0 || idx >= this.size) {
            System.out.println("Invalid index");
            return null;
        }
        int i = 0;
        Node node = this.head;
        while (i < idx) {
            i++;
            node = node.next;
        }
        node.data = data;
        return node;
    }

    //retrieving data at a given index
    Node getDataAt(int idx) {
        if (idx < 0 || idx > this.size) {
            System.out.println("Invalid index");
        }
        Node node = this.head;
        int i = 0;
        while (i < idx) {
            i++;
            node = node.next;
        }
        System.out.println("Data at " + idx + " is: " + node.data);
        return null;
    }

    //defining Node class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}