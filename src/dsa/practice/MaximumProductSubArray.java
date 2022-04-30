package dsa.practice;

import java.util.Scanner;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(maximumProductSubArray(arr, n, k));
    }

    public static long maximumProductSubArray(long[] arr, int n, int k) {
        long res = 1;
        long maxProduct = 1;
        long currProduct = 1;
        int i = 0;
        while (i < n) {
            
            i++;
        }
        return res;
    }
}
