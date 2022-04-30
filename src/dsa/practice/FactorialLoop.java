package dsa.practice;

import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialLoop(n));
    }

    public static long factorialLoop(int n) {
        long fact = 1;
        for (int i = n; i >= 2; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
