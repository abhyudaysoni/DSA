package dsa.assignments.completed;

import java.util.Scanner;

public class SmallerElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int queries = sc.nextInt();
        for (int q = 0; q < queries; q++) {
            int k = sc.nextInt();
            System.out.println(smallerElements(arr, n, k));
        }
    }

    static int smallerElements(int a[], int n, int k) {
        int idxOfK = binarySearch(a, k);
        if (idxOfK == a.length)
            return idxOfK;
        if (a[idxOfK] == k) {
            return idxOfK + 1;
        } else if (a[idxOfK] > k) {
            for (int i = idxOfK; i >= 0; i--) {
                if (a[i] <= k) {
                    return i + 1;
                }
            }
        }
        return 0;
    }

    static int binarySearch(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int midIdx = (start + end) / 2;
            int midItem = arr[midIdx];
            if (midItem == k) {
                start = midIdx;
                break;
            } else if (midItem > k) {
                end = midIdx - 1;
            } else {
                start = midIdx + 1;
            }
        }
        return start;
    }
}






/*

package DSA1.assignments.inProgress;

import java.util.Scanner;

public class SmallerElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int queries = sc.nextInt();
        for (int q = 0; q < queries; q++) {
            int k = sc.nextInt();
            System.out.println(smallerElements(arr, n, k));
        }
    }

    public static int smallerElements(int[] a, int n, int k) {
        return binarySearch(a, n, k);
    }

    public static int binarySearch(int[] arr, int n, int k) {
        if (k >= arr[n - 1]) {
            return n;
        }
        int l = 0;
        int r = n - 1;
        int min;
        int count = 0;
        while (l <= r) {
            min = r - l;
            int mid = l + (r - l) / 2;
            if (arr[mid] == k) {
                if (arr[mid] == arr[mid + 1]) {
                    int i = mid;
                    while (i <= r) {
                        {
                            count++;
                            i++;
                        }
                    }
                    return mid + count;
                } else
                    return mid + 1;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else if (arr[mid] > k) {
                r = mid - 1;
            }
            if (min == 0)
                return n;
            else if (min == 1)
                return l;
        }
        return l + 1;
    }
}







 */









/* brute force method using pivot index


package DSA1.assignments.inProgress;

        import java.util.Scanner;

public class SmallerElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int queries = sc.nextInt();
        for (int q = 0; q < queries; q++) {
            int k = sc.nextInt();
            System.out.println(smallerElements(arr, n, k));
        }
    }

    public static int smallerElements(int[] a, int n, int k) {
        int BI = binarySearch(a, n, k);
        System.out.println("BI: " + BI);
        if (BI == -1) {
            int[] arr3 = new int[n + 1];
            for (int i = 0; i < arr3.length - 1; i++) {
                arr3[i] = a[i];
            }
            arr3[arr3.length - 1] = k;
            int pi = partitionIndex(arr3, 0, arr3.length - 1);

            return pi;
        }
        return BI + 1;
    }

    public static int binarySearch(int[] arr, int n, int k) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
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
}*/
