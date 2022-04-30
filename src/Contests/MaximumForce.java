package Contests;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            long sq = sc.nextLong();
            arr[i] = sq * sq;
        }
        Arrays.sort(arr);
        long sum = 0;
        for (int i = n - 1; i >= n - k; i--) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
