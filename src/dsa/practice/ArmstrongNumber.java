package dsa.practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        int c = a;
        int b, count = 0;
        double ar[] = new double[20];
        while (a >= 1) {
            b = a % 10;
            a = a / 10;
            ar[count] = b;
            count++;
        }
        double sum = 0;
        for (int j = 0; j < count; j++) {
            sum = sum + Math.pow(ar[j], 3);
        }
//        System.out.println((int) sum);
//        System.out.println(c);
        if ((int) sum == c) {
            System.out.println(c + " is an armstrong number");
        } else
            System.out.println(c + " not an armstrong number");
    }
}
