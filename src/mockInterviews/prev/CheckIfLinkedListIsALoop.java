package mockInterviews.prev;

import java.util.HashMap;

public class CheckIfLinkedListIsALoop {
    Node head;

    public static void main(String[] args) {

    }

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

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
