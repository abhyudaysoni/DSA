package dsa.assignments.completed;

import java.util.Scanner;

public class fOfi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f_n = sc.nextInt();

        while (n > 1) {
            int ans = 0;
            int i = 1;
            while (ans != f_n) {
                if (i < 0) {
                    return;
                }
                ans = (2 * i);
                i++;
            }
            f_n = --i;
            n--;
        }
        System.out.println(f_n);
    }
}
