package Contests;

import java.util.Scanner;

public class CONTEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int t = 0; t < testcases; t++) {

            int nr = sc.nextInt();
            int mc = sc.nextInt();
            boolean res = true;
            int[][] arr = new int[nr][mc];
            for (int i = 1; i < nr; i++) {
                for (int j = 0; j < mc; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 1; i < nr; i++) {
                for (int j = 0; j < mc; j++) {
                    arr[i][j] = arr[i][j] - 1;
                    if (arr[i][j] == 0) {
                        res = false;
                        break;
                    }
                }
            }
            if (res) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
