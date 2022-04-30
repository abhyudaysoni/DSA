package dsa.hashing.assignments.inProgress;

import java.util.Arrays;
import java.util.Scanner;

public class GroupOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxE = -1;

        for (int i = 0; i < n; i++) {
            maxE = Math.max(maxE, arr[i]);
        }

        int[] fqArr = new int[maxE + 1];

        for (int i = 0; i < n; i++) {
            fqArr[arr[i]]++;
        }

        System.out.println(Arrays.toString(fqArr));
    }
}
