package dsa.assignments.completed;

import java.util.Scanner;

public class AlternateMatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int whiteSum = 0;
        int blackSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    blackSum = blackSum + arr[i][j];
                } else {
                    whiteSum = whiteSum + arr[i][j];
                }
            }
        }

        System.out.println(blackSum);
        System.out.println(whiteSum);
    }
}
