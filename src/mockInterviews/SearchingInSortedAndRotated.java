package mockInterviews;

import java.util.Scanner;

public class SearchingInSortedAndRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int k = sc.nextInt();
        int[] arr = new int[n];
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxIndex = findMaxIndex(arr, n);
        System.out.println(maxIndex);
    }

    public static int findMaxIndex(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int binarySearch(int[] arr, int l, int r, int k) {
        if (l > r) return -1;
        int mid = (l + r) / 2;
        if (arr[mid] == k) {
            return mid + 1;
        } else if (k > mid) {
            return binarySearch(arr, mid + 1, r, k);
        } else {
            return binarySearch(arr, l, mid - 1, k);
        }
    }
}

// fin
