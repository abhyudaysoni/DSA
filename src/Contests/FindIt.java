package Contests;

import java.util.Scanner;

/*
x = -b(+/-)(root(b^2-4ac)/2a)
*/
public class FindIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double k = sc.nextDouble();
        double a = 1, b = 3;
        double rootInside = Math.sqrt((b * b) - (4 * a * (-k)));
        double root1 = (-b + rootInside) / 2 * a;
        double root2 = (-b - rootInside) / 2 * a;

        if (root1 > 0 && root1 == (int) root1) {
            System.out.println((int) root1);
        } else if (root2 > 0 && root2 == (int) root2) {
            System.out.println((int) root2);
        } else {
            System.out.println(-1);
        }
    }
}
