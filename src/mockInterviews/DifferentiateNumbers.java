//Q: group negative and positive numbers separately in an array not necessarily sorted

package mockInterviews;

import java.util.Arrays;
import java.util.Scanner;

public class DifferentiateNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(group(arr, n)));
    }

    public static int[] group(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                swap(arr, i, j);
                j++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
