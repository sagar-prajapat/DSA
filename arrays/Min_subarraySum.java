package arrays;

import java.util.Scanner;

public class Min_subarraySum {
    public static void minSubarraySum(int arr[]) {
        int currsum = 0;
        int min = Integer.MAX_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (min > currsum) {
                    min = currsum;
                }
            }

        }
        System.out.println("Minimum subarray sum is " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        minSubarraySum(arr);
    }
}
