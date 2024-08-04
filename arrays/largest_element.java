package arrays;

import java.util.Scanner;

public class largest_element {
    public static int getlargest(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = getlargest(arr);

        System.out.println("largest is: " + largest);
    }

}
