package dsa.assignments.completed;

import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Limit: ");
        int n = sc.nextInt();
        System.out.println("Enter Array: ");
        int[] arr1 = new int[n - 1];
        for (int k = 0; k < n - 1; k++) {
            arr1[k] = sc.nextInt();
        }
        int i = 1;
        while (i <= n) {
            boolean flag = false;
            int j = 0;
            while (j < n - 1) {
                if (arr1[j] == i) {
                    flag = true;
                    break;
                } else {
                    j++;
                }
            }
            if (flag == false) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
