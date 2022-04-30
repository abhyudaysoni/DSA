package dsa.linkedList.practice;

public class CircularLinkedListObject {
    Node head;
    int size;

    public CircularLinkedListObject() {
        this.size = 0;
    }

    public static void main(String[] args) {
        CircularLinkedListObject list = new CircularLinkedListObject();
        for (int i = 1; i < 10; i++) {
            list.addLast(i);
        }
        list.makeItCircular();
        System.out.println("Is circular: " + list.checkIfCircular());

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
        if (head == null) {
            head = node;
        } else {
            Node i = head;
            while (i.next != head) {
                i = i.next;
            }
            i.next = node;
            node.next = head;
        }
        return head;
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

    Node makeItCircular() {
        Node i = head;
        while (i.next != null) {
            i = i.next;
        }
        i.next = head;
        return head;
    }

    boolean checkIfCircular() {
        Node i = head.next;
        while (i != null) {
            if (i == head)
                return true;
            i = i.next;
        }
        return false;
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