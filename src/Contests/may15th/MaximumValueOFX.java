package Contests.may15th;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumValueOFX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arrList.add(val);
        }
        System.out.print(findMaxX(arrList, k));
    }

    public static int findMaxX(ArrayList<Integer> arrayList, int k) {
        int x = 0;
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = arrayList.size() - 1; j > i; j--) {
                int biggerElement = Math.max(arrayList.get(i), arrayList.get(j));
                x = x + biggerElement;
                removeElement(arrayList, i, j);
                count++;
                if (count >= k) {
                    break;
                }
            }
        }
        return x;
    }

    public static void removeElement(ArrayList<Integer> arrayList, int i, int j) {
        if (arrayList.get(i) > arrayList.get(j)) {
            arrayList.remove(i);
        } else if (arrayList.get(i) < arrayList.get(j)) {
            arrayList.remove(j);
        } else {
            arrayList.remove(i);
        }
    }
}
