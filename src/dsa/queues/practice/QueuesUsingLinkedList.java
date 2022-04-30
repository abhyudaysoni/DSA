package dsa.queues.practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesUsingLinkedList {
    Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        QueuesUsingLinkedList q = new QueuesUsingLinkedList();
        q.addQ(4);
    }

    void addQ(int val) {
        queue.add(val);
    }
}
