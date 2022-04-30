package dsa.assignments.completed;

import java.util.Scanner;

public class CheckLogicalOps {
    public static boolean Logical_AND(int a, int b) {
        if (a <= 10 && b >= 10) {
            return true;
        } else
            return false;
    }

    public static boolean Logical_OR(int a, int b) {
        if (a % 2 == 0 || b % 2 == 0) {
            return true;
        } else
            return false;
    }

    public static boolean Logical_NOT(int a, int b) {
        if (a != b) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Logical_AND(a, b));
        System.out.println(Logical_OR(a, b));
        System.out.println(Logical_NOT(a, b));
    }
}
