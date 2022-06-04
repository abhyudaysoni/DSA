package mockInterviews.june2nd;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(median(arr1, arr2));
    }

    static float median(int[] arr1, int[] arr2) {
        float median = 0;
        int[] res = merge(arr1, arr2);
        System.out.println(Arrays.toString(res));
        if ((res.length) % 2 == 0) {
//            System.out.println(res[res.length / 2 - 1]);
//            System.out.println(res[res.length / 2]);
            median = (float) (res[res.length / 2 - 1] + res[res.length / 2]) / 2;
        } else {
            median = res[res.length / 2];
        }
        return median;
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] res = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(res.length);
        return res;
    }
}
