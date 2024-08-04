package arrays;

import java.util.Scanner;

public class Binary_search {
    public static int Binary_search(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {// found
                return mid;
            } else if (arr[mid] < key) {// search right side
                start = mid + 1;
            } else {//// search left side
                end = mid - 1;
            }
        }
        return -1;// not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter element to search : ");
        int key = sc.nextInt();

        int result = Binary_search(arr, key);
        System.out.println("element found at index : " + result);
    }
}
