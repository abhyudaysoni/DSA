package dsa.assignments.inProgress;

import java.util.Arrays;
import java.util.Scanner;

public class CampSetup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        minDistance(n, n, arr);
    }

    static void minDistance(int n, int k, int[][] point) {
        for (int i = 0; i < k; i++)
            Arrays.sort(point[i]);
        for (int i = 0; i < k; i++)
            System.out.print(point[i][(int) Math.ceil((double) (n / 2) - 1)] + " ");
    }
}
