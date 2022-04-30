package dsa.queues;

import java.util.Deque;
import java.util.LinkedList;

public class CustomDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
    }

    static void push_back_pb(Deque<Integer> dq, int x) {
        dq.addLast(x);
    }

    static void push_front_pf(Deque<Integer> dq, int x) {
        dq.addFirst(x);
    }

    static void pop_back_ppb(Deque<Integer> dq) {
        if (dq.isEmpty()) {
            return;
        } else {
            dq.removeLast();
        }
    }

    static int front_dq(Deque<Integer> dq) {
        if (dq.isEmpty()) {
            return -1;
        } else {
            return dq.peek();
        }
    }
}

