// Example 1:

// Input: arr = [2,1]
// Output: false
// Example 2:

// Input: arr = [3,5,5]
// Output: false
// Example 3:

// Input: arr = [0,3,2,1]
// Output: true

import java.util.Scanner;

public class valid_mountain_array {
    public static boolean valid_mountain_array(int arr[]) {
        int len = arr.length;
        int i = 0;
        int j = arr.length - 1;

        while (i + 1 < len && arr[i + 1] > arr[i]) {
            i++;
        }
        while (j > 0 && arr[j - 1] > arr[j]) {
            j--;
        }

        if (i > 0 && j < len - 1) {
            if (i == j) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(valid_mountain_array(arr));
    }
}
