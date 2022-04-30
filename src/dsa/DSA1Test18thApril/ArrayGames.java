package dsa.DSA1Test18thApril;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ArrayGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestSubarray(arr, k));
    }

    public static int diff(int[] arr, int k, int n) {
        int result = 0;
        int maxSubArray = 0;
        for (int i = n - 1; i > -1; i--) {
            int max = arr[i];
            int min = arr[i];
            int j;
            for (j = i; j < n; j++) {
                int p = arr[j];
                max = Math.max(max, p);
                min = Math.min(min, p);
                if ((max - min) >= k)
                    break;
            }
            result = (j - i);
            if (result > maxSubArray) {
                maxSubArray = result;
            }
        }
        return maxSubArray;
    }

    public static int longestSubarray(int[] nums, int limit) {
        int N = nums.length;
        int res = 0;

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        int l = 0;
        int r = 0;

        pq1.add(nums[0]);
        pq2.add(nums[0]);

        while (l < N && r < N) {
            if (pq2.peek() - pq1.peek() <= limit) {
                res = Math.max(res, r - l + 1);
                r++;

                if (r == N) break;

                pq1.add(nums[r]);
                pq2.add(nums[r]);

            } else {
                pq1.remove(nums[l]);
                pq2.remove(nums[l]);
                l++;
            }
        }
        return res;
    }
}
/*
10
5
-4
6
-3
1
-2
7
-5
5
4
 */