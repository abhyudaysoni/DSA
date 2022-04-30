package dsa.assignments.completed;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();

        for (int t = 0; t < tests; t++) {

            int lim = sc.nextInt();
            int findNum = sc.nextInt();
            int[] arr = new int[lim];

            for (int i = 0; i < lim; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(binarySearch(arr, lim, findNum));
        }
    }

    public static int binarySearch(int[] arr, int n, int k) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == k)
                return 1;
            else if (arr[mid] < k)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
}
