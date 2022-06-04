package dsa.practice;

import java.util.Scanner;

public class ShuffleIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        shuffleArray(arr, n);
    }

    static void shuffleArray(int arr[], int n)

    // Your code goes herevoid shuffleArray(long arr[], int n)
    {
        helper(arr, n, 0);
    }

    static void helper(int arr[], int n, int idx) {
        if (idx == n / 2) return;
        System.out.print(arr[idx] + " ");
        System.out.print(arr[idx + (n / 2)] + " ");
        helper(arr, n, idx + 1);
    }
}
