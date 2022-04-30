package dsa.practice;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        int fact;
        if (n == 1)
            return 1;
        else
            fact = n * factorial(n - 1);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
