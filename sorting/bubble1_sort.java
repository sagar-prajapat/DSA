//time-complexity:
//best-case:o(n)
//worst-case:o(n^2)

import java.util.Scanner;

public class bubble1_sort {
    public static void Bubble_sort(int arr[]) {
        boolean swap;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            swap = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            // If no elements were swapped, the array is already sorted
            if (!swap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Bubble_sort(arr);

        System.out.println("sorted array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
