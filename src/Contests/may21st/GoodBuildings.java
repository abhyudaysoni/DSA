package Contests.may21st;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodBuildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        goodBuildings(arr);
    }

    static void goodBuildings(int[] arr) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                ls.add(arr[i]);
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = ls.size() - 1; i >= 0; i--) {
            System.out.print(ls.get(i) + " ");
        }
    }
}
