package dsa.assignments.completed;

import java.util.Scanner;

public class SimplePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long sum;
        int count, t = 0;
        long i = 2, j = 0, flag, l = 0;
        long[] pArr = new long[50000];

        t = sc.nextInt();

        i = 2;
        count = 1;
        while (count <= 50000) {
            flag = 0;
            for (j = 2; j <= Math.sqrt(i); j++)
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            if (flag == 0) {
                pArr[count - 1] = i;
                count++;
            }
            i++;
        }

        int[][] tArr = new int[t][2];
        for (int x = 0; x < t; x++) {
            for (int y = 0; y < 2; y++) {
                tArr[x][y] = sc.nextInt();
            }
        }

        for (int x = 0; x < t; x++) {
            sum = 0;
            int y = (tArr[x][0]) - 1;
            while (y <= (tArr[x][1]) - 1) {
                sum = sum + pArr[y];
                y++;
            }
            System.out.println(sum);
        }
    }
}