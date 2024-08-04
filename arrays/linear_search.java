package arrays;

import java.util.Scanner;

public class linear_search {
    public static void linear_search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element is present at index :" + i);
            }
        }
        System.out.println("target not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter element to search : ");
        int target = sc.nextInt();

        linear_search(arr, target);
    }
}
