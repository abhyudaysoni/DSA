package dsa.assignments.completed;

import java.util.Scanner;

public class XOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Limit: ");
        int n = sc.nextInt();
        long arr[] = new long[n + 1];
        System.out.println("Enter Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + ((n - i) ^ arr[i - 1]);
        }
        System.out.println(sum);
    }
}
