package dsa.assignments.completed;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String[] arr = new String[testCases];
        for (int t = 0; t < testCases; t++) {
            arr[t] = sc.next();
        }
        for (int t = 0; t < testCases; t++) {
            CountLetters(arr[t]);
            System.out.println("");
        }
    }

    public static void CountLetters(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count == 1) {
                System.out.print(str.charAt(i) + "1");
            } else {
                System.out.print(str.charAt(i));
                System.out.print(count);
            }
        }
    }
}