package dsa.stacks.assignments.completed;

public class ArrayImplementationOfStack {
    int[] a = new int[1000];
    int size = 0;
    int top = -1;

    public static void main(String[] args) {

    }

    void push(int x, int size) {
        //enter  your code here
        if (top >= size - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            a[top] = x;
        }
    }

    // Function to pop element from stack
    void pop() {
        // enter your code here
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            a[top] = 0;
            top--;
        }
    }

    void top() {
        //enter your code here
        if (top == -1) {
            System.out.println("Empty stack");
        } else {
            System.out.println(a[top]);
        }
    }
}
