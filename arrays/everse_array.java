package arrays;

import java.util.Scanner;

public class everse_array {
    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("array before reverse  : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        System.out.println("array after reverse : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
