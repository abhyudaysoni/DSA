package mockInterviews.may13th;

public class RemovingDuplicates {
    Node head;

    Node removeDuplicates(Node head) {
        Node i = head;
        while (i.next != null) {
            if (i.next.data == i.data) {
                if (i == head) {
                    this.head = i.next;
                }
                i.next = i.next.next;
            }
            i = i.next;
        }
        return head;
    }

    void display() {
        Node i = this.head;
        while (i != null) {
            System.out.print(i.data + "->");
            i = i.next;
        }
    }

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
        return node;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        RemovingDuplicates rm = new RemovingDuplicates();
        rm.addLast(11);
        rm.addLast(11);
        rm.addLast(11);
        rm.addLast(15);
        rm.addLast(43);
        rm.addLast(43);
        rm.addLast(60);
        rm.removeDuplicates(rm.head);
        rm.display();
    }
}
