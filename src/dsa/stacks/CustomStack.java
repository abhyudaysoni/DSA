package dsa.stacks;

import java.util.ArrayList;

public class CustomStack<T> {
    ArrayList<T> data;

    CustomStack() {
        this.data = new ArrayList<>();
    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }

    T peek() {
        if (this.data.isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        }
        return data.get(this.data.size() - 1);
    }

    T pop() {// TC O(n)
        if (this.data.isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        }
        return this.data.remove(this.data.size() - 1);
    }

    int size() {
        return data.size();
    }

    void push(T val) {
        data.add(val);
    }
}
