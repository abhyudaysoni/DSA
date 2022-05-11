package mockInterviews;

import java.util.HashMap;
import java.util.Scanner;

public class CommonInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        System.out.println("arr1");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
            int fq = hm1.getOrDefault(arr1[i], 0);
            hm1.put(arr1[i], fq + 1);
        }
        System.out.println("arr2");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
            int fq = hm2.getOrDefault(arr2[i], 0);
            hm2.put(arr2[i], fq + 1);
        }
        System.out.println(hm1);
        System.out.println(hm2);
        
    }
}
