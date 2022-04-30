package dsa.practice;

import java.util.Scanner;

public class PowerOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(powerOpt(a, b));
    }

    public static long powerOpt(long n, long x) {
        if (x == 0)
            return 1;
        if (x == 1)
            return n;
        long res = powerOpt(n, x / 2);
        res = res * res;
        if (x % 2 == 1) {
            res = res * n;
        }
        return res;
    }
}