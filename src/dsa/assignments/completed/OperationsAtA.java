package dsa.assignments.completed;

import java.util.ArrayList;
import java.util.Scanner;

public class OperationsAtA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests != 0) {
            int num = sc.nextInt();
            int steps = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> result = new ArrayList<>();
            arr.add(num);
            while (steps > 0) {
                int len = arr.size();
                for (int i = 0; i < len; i++) {
                    arr.add(arr.get(i) + 3);
                    arr.add(arr.get(i) - 3);
                    arr.add(arr.get(i) * 2);
                }
                steps--;
            }
            for (int i = 0; i < arr.size(); i++) {
                if (!result.contains(arr.get(i))) {
                    result.add(arr.get(i));
                }
            }
            System.out.println(result.size());
            tests--;
        }
    }
}

//
//import java.io.*; // for handling input/output
//        import java.util.*; // contains Collections framework
//
//// don't change the name of this class
//// you can add inner classes if needed
//class Main {
//    public static void main (String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int tests=sc.nextInt();
//        while(tests!=0){
//
//            int num = sc.nextInt();
//            int steps = sc.nextInt();
//            ArrayList<Integer> arr = new ArrayList<>();
//            ArrayList<Integer> result = new ArrayList<>();
//
//            arr.add(num);
//            while(steps>0){
//                int len = arr.size();
//                for(int i=0; i<len; i++){
//                    arr.add(arr.get(i)+3);
//                    arr.add(arr.get(i)-3);
//                    arr.add(arr.get(i)*2);
//                }
//                steps--;
//            }
//
//            for(int i=0; i<arr.size(); i++){
//                if(!result.contains(arr.get(i))){
//                    result.add(arr.get(i));
//                }
//            }
//
//            System.out.println(result.size());
//            tests--;
//        }
//
//    }
//}
