//package dsa1.assignments.inProgress;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Scanner;
//
//public class ThreeWayPartitioning {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int testcases = sc.nextInt();
//        for (int t = 0; t < testcases; t++) {
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//            System.out.println(Arrays.toString(threeWayPartition(arr, a, b)));
//        }
//    }
//
//    public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int lowVal, int highVal) {
//        Collection.sort(A);
//        return A;
//    }
//}
///*
//
//1
//10
//4 8
//8
//7
//3
//5
//4
//9
//3
//5
//7
//8
//
// */