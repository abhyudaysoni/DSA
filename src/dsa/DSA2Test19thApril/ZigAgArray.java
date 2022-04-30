package dsa.DSA2Test19thApril;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZigAgArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < n; i += 2) {
            int num = arr[i];
            if (map1.containsKey(num))
                map1.put(num, map1.get(num) + 1);
            else
                map1.put(num, 1);
        }
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 1; i < n; i += 2) {
            int num = arr[i];
            if (map2.containsKey(num))
                map2.put(num, map2.get(num) + 1);
            else
                map2.put(num, 1);
        }
        int max1 = 0, val1 = 0, max2 = 0, val2 = 0;
        for (Map.Entry e : map1.entrySet()) {
            if ((int) e.getValue() > max1) {
                max1 = (int) e.getValue();
                val1 = (int) e.getKey();
            }
        }
        for (Map.Entry e : map2.entrySet()) {
            if ((int) e.getValue() > max2) {
                max2 = (int) e.getValue();
                val2 = (int) e.getKey();
            }
        }
        int ans = 0;
        for (Map.Entry e : map1.entrySet()) {
            if ((int) e.getKey() != val1)
                ans += (int) e.getValue();
        }
        for (Map.Entry e : map2.entrySet()) {
            if ((int) e.getKey() != val2)
                ans += (int) e.getValue();
        }
        System.out.println(ans);
    }
}
