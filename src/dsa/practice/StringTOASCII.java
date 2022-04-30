package dsa.practice;

import java.util.Scanner;

public class StringTOASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            int temp = (int) a.charAt(i);
            System.out.print(" " + temp);
        }
    }
}
