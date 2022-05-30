package Contests.may21st;

import java.util.Arrays;
import java.util.Scanner;

public class YingYangFestival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        if (yinYangFestival2(arr, x) >= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static long yinYangFestival2(long[] arr, long x) {
        Arrays.sort(arr);
        long sum = 0;
        long count = 0;
        int i = 0;

        while (sum <= x) {
            long tmp = sum + arr[i];
            if (tmp > x) {
                break;
            } else {
                sum += arr[i];
                count++;
            }
            i++;
        }
        return count;
    }

    public static boolean yinYangFestival(long[] arr, long x) {
        boolean res = false;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] >= x) {
                    res = true;
                    break;
                }
            }
        }
        return res;
    }
}
