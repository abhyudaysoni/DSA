package dsa.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(mergeTwoSortedArrays(arr1, n, arr2, m)));
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int n, int[] arr2, int m) {
        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[m + n];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;
    }
}
