package dsa.practice;

import java.util.LinkedList;

public class CustomHM {
    private LinkedList<HMNode>[] bucket;
    private int size;

    public CustomHM() {
        initialize(4);
        this.size = 0;
    }

    public static void main(String[] args) {
        CustomHM hm = new CustomHM();
        hm.put("India", 30);
        hm.put("US", 300);
        hm.put("China", 3000);
        hm.put("Australia", 30000);
        hm.put("UK", 300000);
        hm.display();
        hm.put("India", 5);
        System.out.println("----------------------");
        hm.display();
    }

    private void initialize(int cap) {
        this.bucket = new LinkedList[cap];
        for (int i = 0; i < cap; i++) {
            this.bucket[i] = new LinkedList<HMNode>();
        }
    }

    private double getLambda() {
        return this.size * (1.0 / this.bucket.length);
    }

    private void rehashing() {
        LinkedList<HMNode>[] old = this.bucket;
        initialize(this.bucket.length * 2);
        for (LinkedList<HMNode> ll : old) {
            for (HMNode node : ll) {
                put(node.key, node.value);
            }
        }
    }

    void display() {
        for (LinkedList<HMNode> ll : this.bucket) {
            for (HMNode node : ll) {
                System.out.println(node.key + " = " + node.value);
            }
        }
    }

    public void put(String key, Integer val) {
        int bi = getBucketIndex(key);
        for (HMNode node : bucket[bi]) {
            if (node.key.equals(key)) {
                node.value = val;
                return;
            }
        }
        HMNode node = new HMNode(key, val);
        bucket[bi].addLast(node);
        this.size++;
        if (getLambda() < 2.0) {
            return;
        }
        rehashing();
    }

    private int getBucketIndex(String key) {
        return Math.abs(key.hashCode() % bucket.length);
    }

    class HMNode {
        String key;
        Integer value;

        HMNode(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }
}
