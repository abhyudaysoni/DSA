package mockInterviews.may16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-1, 2, 3, -5, 0, -2, 7, -6, 0, -9, 4, 8, 2};
        int n = 6;
        int count = 0;
//        //O(n)
//        //print count of pairs that sum to n
//        //(-1, 7)()
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(n - arr[i])) {
                count = count + hm.get(n - arr[i]);
            }
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i] + 1));
            } else {
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);
        System.out.println(count);
    }
}
