package dsa.practice;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, ch = 0, y = 0, total = 0;
        y = n / 500;
        ch = n % 500;
        if (ch <= 200)
            x = x + 1;
        else if (ch >= 400)
            x = x + 2;
        total = ((500 * y) + (200 * x)) - n;
        System.out.println(total);
    }
}
