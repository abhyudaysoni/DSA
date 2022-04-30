package dsa.DSA2Test19thApril;

import java.util.Scanner;

public class ScoreBar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0, diff;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 1; j < n; j++) {
            diff = arr[j] - arr[j - 1];
            if (res < diff) {
                res = diff;
            }
        }
        System.out.println(res);
    }
}
