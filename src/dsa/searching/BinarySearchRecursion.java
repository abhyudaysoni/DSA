package dsa.searching;

import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        System.out.print("Enter element to find: ");
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = 0;
        int r = n - 1;
        System.out.println("Found at place: " + binarySearchRec(arr, k, l, r));
    }

    private static int binarySearchRec(int[] arr, int k, int l, int r) {
        if (l > r)
            return -1;
        int mid = (l + r) / 2;
        if (arr[mid] == k) {
            return mid + 1;
        } else if (arr[mid] > k) {
            return binarySearchRec(arr, k, l, mid - 1);
        } else {
            return binarySearchRec(arr, k, mid + 1, r);
        }
    }
}
