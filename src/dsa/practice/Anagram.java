package dsa.practice;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String a = sc.nextLine();
        char[] ar = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            ar[i] = a.charAt(i);
        }
        for (int i = 0; i < a.length(); i++) {
            System.out.print(ar[i]);
        }
    }
}
