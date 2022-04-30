package dsa.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 10 * sum + arr[i];
        }
        System.out.println(sum);
        sum = sum + 1;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = sum % 10;
            sum = sum / 10;
        }
        System.out.println(Arrays.toString(arr));
    }
}
