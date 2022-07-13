package dsa.slidingWindow;

import java.util.Scanner;

public class MaximumValueInSubArrayOfSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxValuesInSubArrayOfSizeK(arr, k);
    }

    public static void maxValuesInSubArrayOfSizeK(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
