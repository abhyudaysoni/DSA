package dsa.assignments.completed;

import java.util.Scanner;

public class EasySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[5];
        for (int i = 0; i < 5; i++) {
            strArr[i] = sc.next();
        }
        String[] newStrArr = easySorting(strArr);
        for (int i = 0; i < 5; i++) {
            System.out.print(newStrArr[i] + " ");
        }
    }

    public static String[] easySorting(String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].compareTo(strArr[j]) > 0) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }
        return strArr;
    }
}
