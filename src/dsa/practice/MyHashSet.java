package dsa.practice;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(5);
        myHashSet.add(6);
        myHashSet.add(7);
        myHashSet.add(8);
        myHashSet.add(9);
        myHashSet.add(10);
        myHashSet.add(11);
        System.out.println(myHashSet);
        if (myHashSet.contains(12)) {
            myHashSet.clear();
        }
        System.out.println(myHashSet.clone());
        System.out.println(myHashSet);
    }
}
