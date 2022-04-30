package dsa.assignments.completed;

import java.util.Scanner;

//public class CandyWays {
//    static int mod = 1000000007;
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        long n = sc.nextLong();
//        long a = sc.nextLong();
//        long b = sc.nextLong();
//
//        long total = binaryExponentiation(2, n,);
//        long aWays = nCr(n, a);
//        long bWays = nCr(n, b);
//
//        System.out.println(((total%mod)-((aWays+bWays)%mod)+mod)%mod);
//    }
//
//    public static long nCr(long n, long r) {
//        long numerator = 1;
//        long denominator = factorial(r);
//        long num = n;
//
//        for(long i=0; i<r; i++){
//            numerator = (numerator*num)%mod;
//            num -= 1;
//        }
//
//        return (numerator*binaryExponentiation(denominator, mod-2))%mod;
//    }
//
//    public static long factorial(long n) {
//        long fact = 1;
//        if (n == 0 || n == 1) return 1;
//        for (long i = n; i <= 1; i--) {
//            fact = (fact * i) % mod;
//        }
//        return fact % mod;
//    }
//
//    public static long binaryExponentiation(long x, long y) {
//        long res = 1;
//        while (y > 0) {
//            if (y % 2 != 0)
//                res = (res * x) % mod;
//            x = (x * x) % mod;
//            y /= 2;
//        }
//        return res;
//    }
//}
//


public class CandyWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long p = 1000000007;

        long total = powerMod(2, n, p) - 1;
        long aWays = findNCR(n, a, p);
        long bWays = findNCR(n, b, p);

        System.out.println(((total % p) - ((aWays + bWays) % p) + p) % p);
    }

    public static long factorial(long n, long mod) {
        if (n == 0 || n == 1) return 1;
        long result = 1;
        for (long i = n; i >= 1; i--) {
            result = (result * i) % mod;
        }

        return result % mod;
    }


    public static long findNCR(long N, long R, long mod) {
        long numerator = 1;
        long denominator = factorial(R, mod);
        long num = N;

        for (long i = 0; i < R; i++) {
            numerator = (numerator * num) % mod;
            num -= 1;
        }

        return (numerator * powerMod(denominator, mod - 2, mod)) % mod;
    }

    public static long powerMod(long base, long pow, long mod) {
        long result = 1;

        while (pow > 0) {

            if (pow % 2 != 0) result = ((result * base) % mod);

            base = (base * base) % mod;
            pow /= 2;
        }

        return result;
    }
}
