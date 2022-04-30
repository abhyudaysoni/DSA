package mockInterviews;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverseString(str);
    }

    public static void reverseString(String str) {
        String word = "";
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                result += word + " ";
                word = "";
            } else {
                word = str.charAt(i) + word;
            }
        }
        System.out.println(result += word);
    }
}
