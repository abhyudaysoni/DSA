package dsa.practice;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkPangram(str));
    }

    static boolean checkPangram(String str) {
        HashSet<Character> hsStr = new HashSet<>();
        HashSet<Character> hsAlp = new HashSet<>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            hsStr.add(str.charAt(i));
        }
        hsStr.remove(' ');
        for (int i = 97; i < 123; i++) {
            char ch = (char) i;
            hsAlp.add(ch);
        }
        return hsAlp.equals(hsStr);
    }
}
