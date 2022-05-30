package mockInterviews.may25th;

import java.util.Scanner;

public class RotateStringNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(rotate(str, n));
    }

    public static String rotate(String str, int n) {
        str = str.substring(n) + str.substring(0, n);
        return str;
    }
}
