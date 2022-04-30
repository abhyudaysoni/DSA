package dsa.assignments.completed;

import java.util.Scanner;
import java.util.Arrays;

public class PairThemUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;
        while (i < n / 2) {
            if (x < (arr[i] + arr[j])) {
                x = arr[i] + arr[j];
            }
            i++;
            j--;
            System.out.println(x);
        }
    }
}
