package dsa.assignments.inProgress;

import java.util.Scanner;

public class ABooleanMatrixProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();

        for (int t = 0; t < testcases; t++) {

            int m = sc.nextInt();
            int n = sc.nextInt();

            int[][] arr = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            checkTrue(arr, m, n);

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void checkTrue(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 1) {
                modifyRow(arr, i, m);
            }
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    modifyRow(arr, i, m);
                }
            }
        }
    }

    public static void modifyRow(int[][] arr, int i, int m) {
        for (int k = 0; k < m - 1; k++) {
            arr[i][k] = 1;
        }
    }
}


/*


1
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1


using C++

	void modifyRow(int arr[][], int i, int m) {
        for (int k = 0; k < m - 1; k++) {
            arr[i][k] = 1;
        }
    }
    void checkTrue(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    modifyRow(arr, i, m);
                }
            }
        }
    }
    int main() {

        int testcases;
        cin>>testcases;
        for (int t = 0; t < testcases; t++) {
            int m;
            int n;
			cin>>m;
			cin>>n;
            int arr[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    cin>>arr[i][j];
                }
            }

            checkTrue(arr, m, n);

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    cout<<arr[i][j] + " ";
                }
                cout<<"\n";
            }
        }
		return 0;
    }


 */
