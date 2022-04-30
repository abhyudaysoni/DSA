package mockInterviews;

import java.util.Arrays;
import java.util.Scanner;

public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(countKdivPairs(arr, n, K));
    }

    public static int countKdivPairs(int[] A, int n, int K) {
        // Create a frequency array to count
        // occurrences of all remainders when
        // divided by K
        int[] freq = new int[K];

        // Count occurrences of all remainders
        for (int i = 0; i < n; i++) {
            ++freq[A[i] % K];
            System.out.println(Arrays.toString(freq));

        }
        // If both pairs are divisible by 'K'
        int sum = freq[0] * (freq[0] - 1) / 2;

        // count for all i and (k-i)
        // freq pairs
        for (int i = 1; i <= K / 2 && i != (K - i); i++)
            sum += freq[i] * freq[K - i];
        // If K is even
        if (K % 2 == 0)
            sum += (freq[K / 2] * (freq[K / 2] - 1) / 2);
        return sum;
    }


}
