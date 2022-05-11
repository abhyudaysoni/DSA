package mockInterviews.prev;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr1 = new char[str1.length()];
        char[] arr2 = new char[str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            arr1[i] = str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            arr2[i] = str2.charAt(i);
        }
        System.out.println(checkAnagram(arr1, arr2));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static int checkAnagram(char[] arr1, char[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while (i < arr1.length) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
                if (i == arr1.length)
                    return 1;
            } else break;
        }
        return 0;
    }
}
