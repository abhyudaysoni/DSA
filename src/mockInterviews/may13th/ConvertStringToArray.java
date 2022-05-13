package mockInterviews.may13th;
//try after interview
//lambda function

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertStringToArray {
    static ArrayList<String> strArr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String word = "";
        for (int i = 0; i < str.length(); i++) {

            word = word + str.charAt(i);
            if (str.charAt(i) == ' ') {
                strArr.add(word);
                word = "";
            }
        }
        strArr.add(word);
        System.out.println(strArr);
        for (int i = 0; i < strArr.size(); i++) {
            for (int j = 1; j < strArr.size(); j++) {
                String word1 = strArr.get(j);
                String word2 = strArr.get(j + 1);
                if (word1.charAt(0) > word2.charAt(0)) {
                    swap(word1, word2, j, j + 1);
                }
            }
        }
        System.out.println(strArr);
    }

    static void swap(String word1, String word2, int j, int k) {
        strArr.add(j, word2);
        strArr.add(k, word1);
    }
}
