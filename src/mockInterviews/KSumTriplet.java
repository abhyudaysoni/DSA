package mockInterviews;

import java.util.HashSet;
import java.util.Scanner;

public class KSumTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(dSumTriplet(arr, n, k));
    }

    static boolean dSumTriplet(int[] arr, int n, int k) {
        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> s = new HashSet<>();
            int curr_sum = k - arr[i];
            for (int j = i + 1; j < n; j++) {
                if (s.contains(curr_sum - arr[j])) {
                    System.out.println(arr[i] + " " + arr[j] + " " + (curr_sum - arr[j]));
                    System.out.println();
                    return true;
                }
                s.add(arr[j]);
            }
        }
        return false;
    }
}
