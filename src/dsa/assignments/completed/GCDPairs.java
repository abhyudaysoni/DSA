package dsa.assignments.completed;

import java.util.Scanner;
//
//public class GCDPairs {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        int max = 1;
//        int rs = 1;
//        int i = 0;
//        while (i < n-1) {
//            for (int j = 0; j < n; j++) {
//                rs = GCD(arr[i], arr[i+1]);
//                if (rs > max)
//                    max = rs;
//            }
//            i++;
//        }
//        System.out.println(max);
//    }
//
//    public static int GCD(int a, int b) {
//        if (a % b == 0)
//            return b;
//        int r = a % b;
//        return GCD(b, r);
//    }
//}

public class GCDPairs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxGCDPair(arr, length));

    }


    public static int findMaxGCDPair(int[] arr, int n) {
        int MAX = 0;
        for (int i = 0; i < n; i++) {
            MAX = Math.max(MAX, arr[i]);
        }

        int[] count = new int[MAX + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int counter = 0;

        for (int i = MAX; i >= 1; i--) {
            int j = i;
            while (j <= MAX) {

                if (count[j] > 0) {
                    counter += count[j];
                }

                j += i;

                if (counter >= 2) {
                    return i;
                }

            }

            counter = 0;
        }

        return 1;
    }
}