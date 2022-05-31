package Contests.may15th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumValueOFX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }

        Collections.sort(list);

        long x = 0;
        for (int i = 0; i < k; i++) {
            int l = 0;
            int m = list.size() - 1;

            long val1 = list.get(l);
            long val2 = list.get(m);

            if (val1 == val2) {
                list.remove(l);
            } else {
                list.remove(m);
            }
            x += val2;

        }
        System.out.print(x);
    }
}
