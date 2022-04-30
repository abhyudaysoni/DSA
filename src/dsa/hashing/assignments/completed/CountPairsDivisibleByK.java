package dsa.hashing.assignments.completed;

import java.util.Scanner;

public class CountPairsDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pairCountSumDivideByK(arr, n, k));
    }

    public static long pairCountSumDivideByK(int[] A, long n, int K) {
        int[] freq = new int[K];

        for (int i = 0; i < n; i++)
            ++freq[A[i] % K];

        long sum = (long) freq[0] * (freq[0] - 1) / 2;

        for (int i = 1; i <= K / 2 && i != (K - i); i++)
            sum += (long) freq[i] * freq[K - i];

        if (K % 2 == 0)
            sum += ((long) freq[K / 2] * (freq[K / 2] - 1) / 2);

        return sum;
    }
}
