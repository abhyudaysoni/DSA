package dsa.assignments.completed;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int n = sc.nextInt();
        int m = sc.nextInt();
        float[] arr1 = new float[n];
        float[] arr2 = new float[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextFloat();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextFloat();
        }
        System.out.println(df.format(medianOfSortedArrays(arr1, n, arr2, m)));
    }

    public static double medianOfSortedArrays(float[] arr1, int n, float[] arr2, int m) {
        double median;
        int i = 0, j = 0, k = 0;
        float[] arr3 = new float[m + n];
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
        k = arr3.length;
        if (k % 2 == 0) {
            median = ((arr3[k / 2 - 1] + arr3[(k / 2)]) / 2);
        } else {
            median = arr3[k / 2];
        }
        return median;
    }
}
