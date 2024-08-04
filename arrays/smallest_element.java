package arrays;

import java.util.Scanner;

public class smallest_element {
    public static int getsmallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numbers of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = getsmallest(arr);
        System.out.println("smallest is : " + smallest);
    }
}
