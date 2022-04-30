package dsa.assignments.completed;

import java.util.Scanner;

public class SPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] prime = sieve(10000000);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int n = sc.nextInt();
            int count = 0;

            for (int j = n; j > n / 2; j--) {

                if (prime[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        return prime;
    }
}
