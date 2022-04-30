package dsa.queues;

import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> data;//Linked lists can also be used
    private int size;
    private int front;

    public Queue() {
        this.data = new ArrayList<Integer>();
        this.size = 0;
        this.front = 0;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(30);
        q.add(7);
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(16);
        System.out.println(q.peek());
        System.out.println(q.remove());
    }

    public void add(int val) {//TC O(1)
        data.add(val);
        this.size++;
    }

    public int peek() {//TC O(1)
        if (this.size == 0) {
            return -1;
        }
        return data.get(this.front);
    }

    public int remove() {//TC O(n)in arrayList but O(1) using linkedList
        if (this.size == 0) {
            return -1;
        }
        int ans = /*data.remove(0);*/this.data.get(this.front);
        this.front++;
        this.size--;
        return ans;
    }
}