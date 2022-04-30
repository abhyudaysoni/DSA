package dsa.practice;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a, b));
    }

    public static int power(int n, int x) {
        if (x == 1)
            return n;
        return (n * power(n, x - 1));
    }
}
