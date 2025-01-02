package Arrays;

import java.util.Scanner;

public class sum_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        System.out.println("elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("sum of elements of array is "+sum);
    }
}
