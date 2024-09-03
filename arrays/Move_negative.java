//Move all negative numbers  to one side of array

import java.util.Scanner;

public class Move_negative {
    public static void Rearrange(int arr[]) {
        int temp[] = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        System.out.println("sorted array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter element of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Rearrange(arr);
    }
}
