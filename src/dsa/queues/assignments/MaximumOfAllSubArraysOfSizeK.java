package dsa.queues.assignments;

import java.util.*;

public class MaximumOfAllSubArraysOfSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(maxSum(arr, k)));
    }

    public static int[] maxSum(int[] arr, int k) {
        ArrayList<Integer> maxArr = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>();
        int maxElement = 0;
        for (int i = 0; i < k; i++) {
            q.add(arr[i]);
        }
        return arr;
    }
}
