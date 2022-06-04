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
        maximumSumSubArray(arr, k);
    }

    static void maximumSumSubArray(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
