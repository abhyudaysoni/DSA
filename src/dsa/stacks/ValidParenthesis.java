package dsa.stacks;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        System.out.println(checkBrackets(str));
        System.out.println(longestValidParenthesis(str));
    }

    public static boolean checkBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);

            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((top == '(' && curr == ')') ||
                        (top == '[' && curr == ']') ||
                        (top == '{' && curr == '}')
                ) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static int longestValidParenthesis(String str) {
        int count = 0;
        Stack<Character> brackets = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        countStack.push(-1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                brackets.push('(');
                countStack.push(i);
            } else {
                if (!brackets.empty() && brackets.peek() == '(') {
                    brackets.pop();
                    countStack.pop();
                    count = Math.max(i - countStack.peek(), count);
                } else {
                    countStack.push(i);
                }
            }
        }
        return count;
    }
}
