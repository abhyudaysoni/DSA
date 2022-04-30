package dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        QuickSorting(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void QuickSorting(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int pi = partitionIndex(arr, l, r);
        QuickSorting(arr, l, pi - 1);
        QuickSorting(arr, pi + 1, r);
    }

    public static int partitionIndex(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l, j = l;
        while (i <= r) {
            if (arr[i] <= pivot) {
                if (i != j) {
                    swap(arr, i, j);
                }
                j++;
            }
            i++;
        }
        return j - 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}







/*



public static int[] quickSort(int[] arr, int l, int r)
{
    if(l>=r)
    {
        return arr;
    }
    int pi = partitionIndex(arr, l,r);
    quickSort(arr,l,pi-1);
    quickSort(arr, pi+1, r);
    return arr;
}
    public static int partitionIndex(int[] arr, int l, int r)
    {
        int pivot = arr[r];
        int i = l, j = l;
        while(l<=r){
            if(arr[i] <= pivot)
            {
                if(i!=j)
                {
                    swap(arr, i, j);
                }
                j++;
            }
            i++;
        }
        return j-1;
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 */