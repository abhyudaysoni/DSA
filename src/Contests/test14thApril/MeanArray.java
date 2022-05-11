package Contests.test14thApril;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MeanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(meanArrayStack(arr, n, k));
    }

    static int meanArray(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int mean = (arr[i] + arr[j]) / 2;
                if (mean >= k) {
                    count++;
                }
            }
        }
        return count;
    }

    static int meanArrayStack(int[] arr, int n, int k) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        System.out.println(stack.peek());
        while (stack.peek() == null) {
            int num1 = stack.pop();
            int num2 = stack.pop();
            System.out.println(num1);
            System.out.println(num2);
            int mean = (num1 + num2) / 2;
            if (mean >= k) {
                count++;
            } else {
                stack.pop();
            }
        }
        return count;
    }

    static long countIndices(long[] arr, int n, long k) {
        long ans = 0;
        Arrays.sort(arr);

        int l = 0, r = n - 1;
        while (l < r) {
            long mean = (arr[l] + arr[r]) / 2;
            if (mean >= k) {
                ans += (r - l);
                r--;
            } else {
                l++;
            }
        }
        return ans;
    }
}
