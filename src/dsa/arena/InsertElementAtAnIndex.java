package dsa.arena;

import java.util.Scanner;

public class InsertElementAtAnIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int size = sc.nextInt();
            int element = sc.nextInt();
            int index = sc.nextInt();
            int[] arr = new int[size + 1];
            for (int j = 0; j < size - 1; j++) {
                arr[j] = sc.nextInt();
            }
            for (int z = size; z >= index; z--) {
                arr[z] = arr[z - 1];
            }
            arr[index] = element;
            for (int k = 0; k < size; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
