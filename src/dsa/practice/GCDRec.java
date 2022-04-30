package dsa.practice;

import java.util.Scanner;

public class GCDRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcdRec(a, b));
    }

    public static int gcdRec(int a, int b) {
        if (a % b == 0)
            return b;
        int r = a % b;
        return gcdRec(b, r);
    }
}