package dsa.DSA2Test19thApril;

public class MaximumChocolates {
    /*
        public static int maxChocolates(Node head) {
        Node p1 = head;
        Node p2 = head;
        int max = Integer.MIN_VALUE;
        while (p2 != null && p2.next != null) {
            p2 = p2.next.next;
            p1 = p1.next;
        }
        p1 = reverseLL(p1);
        p2 = head;
        while (p1 != null) {
            max = Math.max((p1.val + p2.val), max);
            p1 = p1.next;
            p2 = p2.next;
        }
        return max;
    }

    public static Node reverseLL(Node head) {
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        head = prev;
        return head;
    }
     */
}
