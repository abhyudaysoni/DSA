package dsa.arena;

import java.util.Arrays;
import java.util.Scanner;

public class CountDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 2];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0;
        int count = 1;
        while (i <= n) {
            if (arr[i] == arr[i + 1]) {
                count++;
                i++;
//                    System.out.println(arr[i] + " " + count);
            } else {
                System.out.println(arr[i] + " " + (count));
                i++;
                count = 1;
            }
        }
//        for (int j = 0; j < n; j++) {
//            System.out.println(arr[j] + " ");
//        }
    }
}
