package mockInterviews.prev;

import java.util.HashSet;
import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        tripletSum(arr, n, k);
    }

    static void tripletSum(int[] arr, int n, int k) {
        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> hs = new HashSet<>();
            int currentSum = k - arr[i];
            for (int j = i + 1; j < n; j++) {
                if (hs.contains(currentSum - arr[j])) {
                    System.out.println(arr[i] + " " + arr[j] + " " + (currentSum - arr[j]));
                    return;
                }
                hs.add(arr[j]);
            }
        }
    }
}
