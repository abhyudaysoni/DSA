package dsa.assignments.completed;

import java.util.Scanner;

public class ModularMultiplicativeInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int m = sc.nextInt();
            int rs = -1;
            for (int j = 1; j < m; j++) {
                if ((a * j) % m == 1) {
                    rs = j;
                    break;
                }
            }
            System.out.println(rs);
        }
    }
}