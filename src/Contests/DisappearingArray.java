package Contests;

import java.util.HashSet;
import java.util.Scanner;

public class DisappearingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hs.add(sc.nextInt());
        }

        for (int i = 1; i <= N; i++) {
            if (!hs.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }

//    static boolean checkIfContains(int[] nums, int i) {
//        boolean res = true;
//        int j = 1;
//        while (j < nums.length) {
//            if (i == nums[j]) {
//                return res;
//            } else
//                res = false;
//            j++;
//        }
//        return res;
//    }
}
