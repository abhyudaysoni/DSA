package Contests.may21st;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> strArr = new ArrayList<>();
        String word = "";
        for (int i = 0; i < str.length(); i++) {

            word = word + str.charAt(i);
            if (str.charAt(i) == ' ') {
                strArr.add(word);
                word = "";
            }
        }
        word = word + ' ';
        strArr.add(word);
        Collections.sort(strArr);
        for (int i = 0; i < strArr.size(); i++) {
            System.out.print(strArr.get(i));
        }
    }
}
