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
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ls.add(arr[i]);
            }
        }
        ls.add(arr[arr.length - 1]);
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
    }
}
