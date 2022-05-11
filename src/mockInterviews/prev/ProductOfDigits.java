package mockInterviews.prev;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long product = 1;
        for (long i = num; i >= 1; i = i / 10) {
            long r = i % 10;
            product *= r;
        }
        System.out.println(product);
        long j = num;
        while (j >= 10) {
            long r = j % 10;
            product *= r;
            j = j / 10;
        }
        System.out.println(product);
        System.out.println(recProduct(num));
    }

    static long recProduct(long num) {
        if (num == 0) {
            return 1;
        } else {
            return (num % 10) * recProduct(num / 10);
        }
    }
}
