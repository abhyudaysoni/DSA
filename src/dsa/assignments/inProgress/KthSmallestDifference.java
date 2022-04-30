package dsa.assignments.inProgress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();


        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(kthDiff(arr, n, k));
        }
    }

    public static int kthDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> diffList = new ArrayList<Integer>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                diffList.add(abs(arr[i], arr[j]));
            }
        }
        return diffList.get(k);
    }

    public static int abs(int x, int y) {
        if (x > y)
            return -(x - y);
        else
            return x - y;
    }
}
