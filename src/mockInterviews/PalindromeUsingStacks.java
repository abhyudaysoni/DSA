package mockInterviews;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeUsingStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String str = sc.nextLine();
        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length(); i++) {
                char curr = str.charAt(i);
                if (stack.isEmpty()) {
                    stack.push(curr);
                } else if (curr == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(curr);
                }
            }
        } else {
            for (int i = 0; i < str.length() / 2; i++) {
                char curr = str.charAt(i);
                stack.push(curr);
            }
            for (int i = str.length() / 2; i < str.length(); i++) {
                char curr = str.charAt(i);
                if (curr == stack.peek()) {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}