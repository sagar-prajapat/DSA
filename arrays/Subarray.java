package arrays;

import java.util.Scanner;

public class Subarray {
    public static void Subarray(int arr[]) {
        int total_subarray = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }

                total_subarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray : " + total_subarray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Subarray(arr);
    }
}
