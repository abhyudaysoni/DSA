package dsa.practice;

import java.util.Scanner;

public class LcaseToUcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String a = sc.nextLine();
        String b = "";
        if (a == a.toUpperCase()) {
            System.out.println("Already uppercase");
        } else
            b = a.toUpperCase();
        System.out.println(b);
    }
}
