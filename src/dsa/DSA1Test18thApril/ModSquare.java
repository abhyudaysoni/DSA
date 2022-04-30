package dsa.DSA1Test18thApril;

import java.util.Arrays;
import java.util.Scanner;

public class ModSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(modSquare(arr, n));
    }

    public static int modSquare(int[] arr, int n) {
        Arrays.sort(arr);
        int ans = 0;
        for (int i = n - 1; i >= 1; i--) {
            if (arr[i] != arr[i - 1]) {
                ans = arr[i - 1];
                break;
            }
        }
        return ans;
    }
}
