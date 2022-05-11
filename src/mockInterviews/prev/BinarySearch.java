package mockInterviews.prev;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(binarySearch(arr, 0, n - 1, k));
    }

    public static int binarySearch(int[] arr, int l, int r, int k) {
        if (l > r)
            return -1;
        int mid = (l + r) / 2;
        if (arr[mid] == k) {
            return mid;
        } else if (arr[mid] > k) {
            return binarySearch(arr, l, mid - 1, k);
        } else {
            return binarySearch(arr, mid + 1, r, k);
        }
    }
}
