package dsa.assignments.completed;

import java.util.Scanner;

public class DTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int p = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countTriplets(arr, n, p));
    }

    private static int countTriplets(int[] arr, int n, int p) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (abs(arr, i, j) <= p && abs(arr, j, k) <= p && abs(arr, k, i) <= p) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static int abs(int[] arr, int i, int j) {
        if (arr[i] < arr[j])
            return arr[j] - arr[i];
        else
            return arr[i] - arr[j];
    }
}
