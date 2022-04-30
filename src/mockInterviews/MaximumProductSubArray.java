package mockInterviews;

import java.util.Scanner;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Sub array product is " + maxSubArrayProduct(arr));
    }

    public static int min(int x) {
        return Math.min(x, 1);
    }

    public static int max(int x) {
        return Math.max(x, 1);
    }

    public static int maxSubArrayProduct(int[] arr) {
        int n = arr.length;
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 0;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                max_ending_here = max_ending_here * arr[i];
                min_ending_here = min(min_ending_here * arr[i]);
                flag = 1;
            } else if (arr[i] == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = max(min_ending_here * arr[i]);
                min_ending_here = temp * arr[i];
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (flag == 0 && max_so_far == 0) return 0;
        return max_so_far;
    }
}
