package mockInterviews.prev;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(checkPalindrome(str));
    }

    public static boolean checkPalindrome(String str) {

        boolean rs = true;
        int i = 0;
        int j = str.length() - 1;
        while (i < str.length() / 2) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                rs = false;
                break;
            }
        }
        return rs;
    }
}
