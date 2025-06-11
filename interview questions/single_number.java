// Input: nums = [2,2,1]
// Output: 1

import java.util.Scanner;

public class single_number {
    public static int single_number(int arr[]) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(single_number(arr));
    }
}
