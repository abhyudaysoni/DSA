package dsa.slidingWindow;

import java.util.Scanner;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumSumSubArray(arr, k));
    }

    static long maximumSumSubArray(int[] arr, int k) {
        int i = 0, j = 0;
        long sum = 0;
        long maxSum = Integer.MIN_VALUE;
        while (j < arr.length) {
            sum = sum + arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, sum);
            }
            sum = sum - arr[i];
            i++;
            j++;
        }
        return maxSum;
    }


}


























