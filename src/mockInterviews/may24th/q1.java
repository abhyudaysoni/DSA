package mockInterviews.may24th;
/*
given two strings
s and t
find the minimum substring in string s such that
it has all the elements of t
eg: s = AAFGGHBCDCAFBD,  t = ABD
ans: AFBD
 */


import java.util.HashMap;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        findMinimumSubstring(str1, str2);
    }

    public static void findMinimumSubstring(String str1, String str2) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            hm.put(str2.charAt(i), hm.getOrDefault(str2.charAt(i), 0) + 1);
        }
        System.out.println(hm);
        
    }
}
