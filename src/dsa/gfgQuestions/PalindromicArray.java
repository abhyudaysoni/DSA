package dsa.gfgQuestions;

import java.util.Scanner;

public class PalindromicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(palindromicArray(arr, n));
    }

    private static int palindromicArray(int[] arr, int n) {
        int rs = 1;
        for (int i = 0; i < n; i++) {
            int j = 0;
            int temp = arr[i];

        }
        return rs;
    }
}