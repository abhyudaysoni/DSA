package dsa.DSA2Test19thApril;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;
        return i2.compareTo(i1);
    }
}

public class BuildingTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n;
        Queue<Integer> queue = new PriorityQueue<>(new MyComparator());
        int disks[] = new int[n];
        for (int i = 0; i < n; i++) {
            disks[i] = sc.nextInt();
            queue.add(disks[i]);
            while (!queue.isEmpty() && queue.peek() == max) {
                System.out.print(queue.poll() + " ");
                max--;
            }
            System.out.println();
        }
    }
}
