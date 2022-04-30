package Contests;

import java.util.Scanner;

public class MysteriousBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int k = sc.nextInt();
        String[] strArr = new String[k];
        for (int i = 0; i < n; i++) {
            if (str.contains(strArr[i])) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
