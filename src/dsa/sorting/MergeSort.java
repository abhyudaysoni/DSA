package dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrBase = new int[n];
        for (int i = 0; i < n; i++) {
            arrBase[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(mergeSort(arrBase, 0, n - 1)));
    }

    public static int[] mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            int[] res = new int[1];
            res[0] = arr[l];
            return res;
        }
        int mid = (l + r) / 2;
        int[] lArr = mergeSort(arr, l, mid);
        int[] rArr = mergeSort(arr, mid + 1, r);
        return mergeTwoSortedArrays(lArr, rArr);
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
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
