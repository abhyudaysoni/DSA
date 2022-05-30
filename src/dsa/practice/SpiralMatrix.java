package dsa.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Clockwise: " + clockwise(arr, m, n));
        System.out.println("Anti-Clockwise: " + antiClockwise(arr, m, n));
    }

    public static ArrayList<Integer> antiClockwise(int[][] arr, int m, int n) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int minRow = 0;
        int minCol = 0;
        int maxRow = m - 1;
        int maxCol = n - 1;
        int t = n * m;
        int count = 0;
        while (count < t) {

            //left wall
            for (int i = minRow, j = minCol; i <= maxRow && count < t; i++) {
                arrList.add(arr[i][j]);
                count++;
            }
            minCol++;

            //bottom wall
            for (int i = maxRow, j = minCol; j <= maxCol && count < t; j++) {
                arrList.add(arr[i][j]);
                count++;
            }
            maxRow--;

            //right wall
            for (int i = maxRow, j = maxCol; i >= minRow && count < t; i--) {
                arrList.add(arr[i][j]);
                count++;
            }
            maxCol--;

            //top wall
            for (int i = minRow, j = maxCol; j >= minCol && count < t; j--) {
                arrList.add(arr[i][j]);
                count++;
            }
            minRow++;
        }
        return arrList;
    }

    public static ArrayList<Integer> clockwise(int[][] arr, int m, int n) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int minRow = 0;
        int minCol = 0;
        int maxRow = m - 1;
        int maxCol = n - 1;
        int t = n * m;
        int count = 0;
        while (count < t) {

            //top wall
            for (int i = minRow, j = minCol; j <= maxCol && count < t; j++) {
                arrList.add(arr[i][j]);
                count++;
            }
            minRow++;

            //right wall
            for (int i = minRow, j = maxCol; i <= maxRow && count < t; i++) {
                arrList.add(arr[i][j]);
                count++;
            }
            maxCol--;

            //bottom wall
            for (int i = maxRow, j = maxCol; j >= minCol && count < t; j--) {
                arrList.add(arr[i][j]);
                count++;
            }
            maxRow--;

            //left wall
            for (int i = maxRow, j = minCol; i >= minRow && count < t; i--) {
                arrList.add(arr[i][j]);
                count++;
            }
            minCol++;

        }
        return arrList;
    }
}
/*

3
3
1
2
3
4
5
6
7
8
9

 */