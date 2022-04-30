package dsa.arena;

import java.util.Scanner;

public class InsertElementAtTheEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int size = sc.nextInt();
            int element = sc.nextInt();
            int[] arr = new int[size + 1];
            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            arr[size] = element;
            for (int k = 0; k < size + 1; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
