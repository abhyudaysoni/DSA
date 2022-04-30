package dsa.practice;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fibRec(a));
    }

    public static int fibRec(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int b = fibRec(n - 1);
        int a = fibRec(n - 2);
        return a + b;
    }
}
