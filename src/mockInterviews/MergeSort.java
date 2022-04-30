package mockInterviews;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
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

    public static int[] mergeTwoSortedArrays(int[] n1, int[] n2) {
        int i = 0, j = 0, k = 0;
        int[] resArr = new int[n1.length + n2.length];
        while (i < n1.length && j < n2.length) {
            if (n1[i] < n2[j]) {
                resArr[k] = n1[i];
                i++;
                k++;
            } else {
                resArr[k] = n2[j];
                j++;
                k++;
            }
        }
        while (n1.length > i) {
            resArr[k] = n1[i];
            i++;
            k++;
        }
        while (n2.length > j) {
            resArr[k] = n2[j];
            j++;
            k++;
        }
        return resArr;
    }
}
