package mockInterviews;

import java.util.HashMap;
import java.util.Scanner;

public class minWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(method1(s, t));
        System.out.println(method2(s, t));
        System.out.println(method3(s, t));
    }

    static String method1(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            int fq = hm.getOrDefault(t.charAt(i), 0);
            hm.put(t.charAt(i), fq + 1);
        }

        int start = 0;
        int end = 0;
        String res = "";
        int minLength = Integer.MAX_VALUE;
        int count = hm.size();

        while (end < s.length() || count == 0) {
            if (count > 0) {
                char c = s.charAt(end);
                if (hm.containsKey(c)) {
                    hm.put(c, hm.get(c) - 1);
                    if (hm.get(c) == 0) {
                        count--;
                    }
                }
                end++;
            } else {
                if (count == 0 && end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    res = s.substring(start, end);
                }
                char c = s.charAt(start);
                if (hm.containsKey(c)) {
                    hm.put(c, hm.get(c) + 1);
                    if (hm.get(c) > 0) {
                        count++;
                    }
                }
                start++;
            }
        }
        return res;
    }

    static public String method2(String s1, String s2) {
        String ans = "";
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        int matchCount = 0;
        int desiredMatchCount = s2.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        int i = -1;
        int j = -1;
        while (true) {
            boolean flag1 = false;
            boolean flag2 = false;

            //acquire
            while (i < s1.length() - 1 && matchCount < desiredMatchCount) {
                i++;
                char ch = s1.charAt(i);
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);

                if (map1.getOrDefault(ch, 0) <= map2.getOrDefault(ch, 0)) {
                    matchCount++;
                }
                flag1 = true;
            }

            while (j < i && matchCount == desiredMatchCount) {
                String subString = s1.substring(j + 1, i + 1);
                if (ans.length() == 0 || subString.length() < ans.length()) {
                    ans = subString;
                }
                j++;
                char ch = s1.charAt(i);
                if (map1.get(ch) == 1) {
                    map1.remove(ch);

                } else {
                    map1.put(ch, map1.get(ch) - 1);
                }
                if (map1.getOrDefault(ch, 0) < map2.getOrDefault(ch, 0)) {
                    matchCount--;
                }
                flag2 = true;
            }
            if (!flag1 && !flag2) {
                break;
            }
        }
        return ans;
    }

    public static String method3(String s1, String s2) {
        String ans = "";
        

        return ans;
    }

}
