package dsa.assignments.completed;

import java.util.Scanner;

public class SortedAndRotated {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int t = 0; t < testCases; t++) {

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            checkIfSortRotated(arr, n);
        }
    }

/*
10
6 7 8 9 10 1 2 3 4 5

10
4 8 6 1 5 2 7 9 10 3

10
4 3 2 1 10 9 8 7 6 5
*/

    static void checkIfSortRotated(int[] arr, int n) {
        int minEle = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        boolean checkAsc = false, checkDes = false;
        //checking minimum element
        for (int i = 0; i < n; i++) {
            if (arr[i] < minEle) {
                minEle = arr[i];
                minIndex = i;
            }
        }
        //System.out.println("min ele: " + minEle);
        //System.out.println("min index: " + minIndex);

        //checking maximum element
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
                maxIndex = i;
            }
        }
        //System.out.println("max ele: " + maxEle);
        //System.out.println("max index: " + maxIndex);

        //checking if elements to the left are in ascending order
        boolean flag1 = true;
        for (int i = 0; i < minIndex - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                flag1 = false;
                //System.out.println("flag1: " + flag1);
                break;
            }
        }

        //checking if elements to the right are in ascending order
        boolean flag2 = true;
        for (int i = minIndex; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                flag2 = false;
                //System.out.println("flag2: " + flag2);
                break;
            }
        }

        //checking if elements to the left are in descending order
        boolean flag3 = true;
        for (int i = 1; i < maxIndex - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                flag3 = false;
                //System.out.println("flag3: " + flag3);
                break;
            }
        }

        //checking if elements to the right are in descending order
        boolean flag4 = true;
        for (int i = maxIndex; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                flag4 = false;
                //System.out.println("flag4: " + flag4);
                break;
            }
        }
        //System.out.println("flag4: " + flag4);

//        if (minIndex == 0) {
//            System.out.print("No");
//            return;
//        }

        //check if ascending
        if ((flag1 && flag2)) {
            checkAsc = true;
            System.out.println("Ascending");
        }
        //check if descending
        else if ((flag3 && flag4)) {
            checkDes = true;
            System.out.println("Descending");
        }

        if ((checkAsc && (arr[n - 1] < arr[0])) || (checkDes && (arr[n - 1] > arr[0])))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
