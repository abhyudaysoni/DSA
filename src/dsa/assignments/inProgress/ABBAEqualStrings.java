package dsa.assignments.inProgress;

import java.util.Scanner;

public class ABBAEqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int countA = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a')
                countA++;
        }
        int countB = n - countA;
        System.out.println(countA + " " + countB);
        int countOps = 0;
        if (countA > countB) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'b') {
                }
            }
        } else {

        }
    }
}
