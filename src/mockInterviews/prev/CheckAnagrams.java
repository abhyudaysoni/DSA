package mockInterviews.prev;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CheckAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println("With sorting O(nlogn): " + check(str1, str2));
        System.out.println("With hashing O(n): " + anagramsHashing(str1, str2));
    }

    static boolean check(String str1, String str2) {
        boolean res = true;
        if (str1.length() != str2.length()) {
            res = false;
            return res;
        }
        char[] arr1 = new char[str1.length()];
        char[] arr2 = new char[str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            arr1[i] = str1.charAt(i);
            arr2[i] = str2.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < str1.length(); i++) {
            if (arr1[i] != arr2[i]) {
                res = false;
            }
        }
        return res;
    }

    static boolean anagramsHashing(String str1, String str2) {
        boolean res = true;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        if (str1.length() != str2.length()) {
            res = false;
            return res;
        }
        for (int i = 0; i < str1.length(); i++) {
            int fq1 = hm1.getOrDefault(str1.charAt(i), 0);
            hm1.put(str1.charAt(i), fq1 + 1);
            int fq2 = hm2.getOrDefault(str2.charAt(i), 0);
            hm2.put(str2.charAt(i), fq2 + 1);
        }
        System.out.println(hm1);
        System.out.println(hm2);
        int i = 0;
        while (i < str1.length()) {
            if (!hm1.containsKey(str2.charAt(i)) || !hm2.containsKey(str1.charAt(i))) {
                res = false;
                return res;
            }
            i++;
        }
        return res;
//
//        aabb ccdd
    }
}
