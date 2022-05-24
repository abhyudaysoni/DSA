package dsa.stacks.assignments.inProgress;

import java.util.Scanner;
import java.util.Stack;

public class EvaluateExpressionUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        String exp = sc.next();
        for (int i = 0; i < exp.length(); i++) {
            st.push(exp.charAt(i));
        }
        System.out.println();
    }
}
