package dsa.practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String a = sc.nextLine();
        a = a.toLowerCase();
        int i = 0, j = a.length(), temp = 0;
        while (i < (a.length() / 2)) {
            if (a.charAt(i) == a.charAt(j - 1)) {
                i++;
                j--;
                temp++;
            } else
                break;
        }
        if (temp == a.length() / 2)
            System.out.println("Given string is a palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
}
