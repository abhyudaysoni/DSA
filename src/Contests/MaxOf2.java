package Contests;

import java.util.Scanner;

public class MaxOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 0 && b > 0) {
            System.out.println(0);
        } else if (a == 0 && b > 2) {
            System.out.println(1);
        } else if (a > 2 && b == 0) {
            System.out.println(1);
        } else if (a == 1 && b == 0) {
            System.out.println(2);
        } else if (b == 1 && a == 0) {
            System.out.println(2);
        }
    }
}
