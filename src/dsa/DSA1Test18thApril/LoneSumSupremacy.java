package dsa.DSA1Test18thApril;

import java.util.HashMap;
import java.util.Scanner;

public class LoneSumSupremacy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = loneSum(arr, n);
        for (int i = 1; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] loneSum(int[] arr, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int fq = hm.getOrDefault(digitSum(arr[i]), 0);
            hm.put(digitSum(arr[i]), fq + 1);
        }
        int[] res = new int[10];
        for (int i = 0; i < res.length; i++) {
            if (hm.containsKey(i)) {
                res[i] = hm.get(i);
            }
        }
        return res;
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0 || sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
