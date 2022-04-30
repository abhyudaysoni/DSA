package dsa.stacks.assignments.inProgress;

import java.util.Stack;

public class StackOperations {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        push(stack, 1);
        push(stack, 2);
        top(stack);
        pop(stack);
        top(stack);
        pop(stack);
        top(stack);
        pop(stack);
    }

    public static void push(Stack<Integer> st, int x) {
        st.push(x);
    }

    public static void pop(Stack<Integer> st) {
        if (st.isEmpty()) {
            System.out.println(0);
        } else
            st.pop();
    }

    public static void top(Stack<Integer> st) {
        if (st.isEmpty()) {
            System.out.println(0);
        } else
            st.peek();
    }
}
