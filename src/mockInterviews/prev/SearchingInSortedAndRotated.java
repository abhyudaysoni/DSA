package mockInterviews.prev;

import java.util.Scanner;

public class SearchingInSortedAndRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Index: " + search(arr, 0, n - 1, key));
    }

    public static int search(int[] arr, int l, int h, int key) {
        if (l > h) {
            return -1;
        }
        int mid = (l + h) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[l] <= arr[mid]) {
            if (key >= arr[l] && key <= arr[mid]) {
                return search(arr, l, mid - 1, key);
            }
            return search(arr, mid + 1, h, key);
        }
        if (key >= arr[mid] && key <= arr[h]) {
            return search(arr, mid + 1, h, key);
        }
        return search(arr, l, mid - 1, key);
    }
}

