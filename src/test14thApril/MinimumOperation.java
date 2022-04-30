package test14thApril;

import java.util.Scanner;

public class MinimumOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        minimumOperation(n);
    }

    static void minimumOperation(int n) {
        int x = 1;
        int y = 1;
        int count = 0;
        while (x < n && y < n) {
            if (x <= y) {
                x = x + y;
            } else {
                y = x + y;
            }
            count++;
        }
        if (n < 100000)
            System.out.print(count);
        else
            System.out.print(count + 1);
    }
}
