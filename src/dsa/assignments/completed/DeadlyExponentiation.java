package dsa.assignments.completed;

import java.util.Scanner;

public class DeadlyExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000007;
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        System.out.println(powMod(a, powMod(b, powMod(c, d, mod - 3), mod - 1), mod));

    }

    public static long powMod(long base, long pow, long mod) {
        if (pow == 0) return 1;
        //   base = base % mod;
        long res = powMod(base, pow / 2, mod);
        if (pow % 2 == 0)
            return (res * res) % mod;
        else
            return (res * res) % mod * base % mod;
    }
}
