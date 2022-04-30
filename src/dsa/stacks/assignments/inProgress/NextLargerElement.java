package dsa.stacks.assignments.inProgress;

import java.util.Scanner;
import java.util.Stack;

public class NextLargerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public static int[] nextLargerElement(int[] arr) {
        int[] newArr = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int currentIdx = 1;
        while (currentIdx < arr.length) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[currentIdx]) {
                newArr[stack.pop()] = arr[currentIdx];
            }
            stack.push(currentIdx);
            currentIdx++;
        }
        while (!stack.isEmpty()) {
            newArr[stack.pop()] = -1;
        }
        return newArr;
    }
}
