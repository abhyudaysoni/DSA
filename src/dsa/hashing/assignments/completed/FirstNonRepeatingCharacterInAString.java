package dsa.hashing.assignments.completed;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacterInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> hm = new HashMap<>();
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int fq = hm.getOrDefault(str.charAt(i), 0);
            hm.put(str.charAt(i), fq + 1);
        }
        int res = -1;
        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i)) == 1) {
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}
