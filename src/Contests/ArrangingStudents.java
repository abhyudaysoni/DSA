package Contests;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangingStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int t = 0; t < testcases; t++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                temp[i] = arr[i];
            }
            Arrays.sort(temp);
            int i = 0;
            int j = 0;
            int count = 0;
            while (i < n) {
                if (arr[i] != temp[j]) {
                    count++;
                }
                i++;
                j++;
            }
            if (count <= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
