package dsa.assignments.completed;

import java.util.Scanner;

public class JianAndSunioHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(EqualOrNot(a, b, c, d));
    }

    static boolean EqualOrNot(int h1, int h2, int v1, int v2) {
        int n1 = 0, n2 = 0;
        boolean rs = true;
        int i = 1;
        while (i <= 10000) {
            n1 = h1 + (i - 1) * v1;
            n2 = h2 + (i - 1) * v2;
            if (n1 == n2) {
                rs = true;
                return rs;
            } else
                i++;
        }
        if (n1 != n2) {
            rs = false;
        }
        return rs;
    }
}
