package dsa.practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2, j, lim, flag, count = 1;
        System.out.print("Enter limit: ");
        lim = sc.nextInt();
        while (count <= lim) {
            flag = 0;
            for (j = 2; j <= i / 2; j++)
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            if (flag == 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
}
