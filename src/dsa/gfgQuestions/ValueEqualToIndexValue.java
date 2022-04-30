package dsa.gfgQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class ValueEqualToIndexValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(valueEqualToIndex(arr, n));
    }

    public static ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> arrNew = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (i + 1 == arr[i]) {
                arrNew.add(arr[i]);
            }
        }
        return arrNew;
    }
}
