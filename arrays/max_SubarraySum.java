//time complexity : o(n^3)

package arrays;

import java.util.Scanner;

public class max_SubarraySum {
    public static void maxSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currsum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.println(arr[k]);
                    currsum += arr[k];
                }
                System.out.println("sum : " + currsum);
                System.out.println();

                if (maxSum < currsum) {
                    maxSum = currsum;
                }

                System.out.println("max sum : " + maxSum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxSubarraySum(arr);
    }
}
