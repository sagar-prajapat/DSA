// Input: arr[] = [1, 2, 4, 5, 7, 8, 3]
// Output: 5
// Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].



import java.util.Scanner;

public class peak_element {
    public static void findPeakElement(int arr[]) {
        int n = arr.length;

        // Check if the first element is a peak
        if (n == 1) {
            System.out.println("position of peak element : 0");
            return;
        }

        if (arr[0] > arr[1]) {
            System.out.println("position of peak element : 0");
            return;
        }

        // Check if the last element is a peak
        if (arr[n - 1] > arr[n - 2]) {
            System.out.println("position of peak element : " + (n - 1));
            return;
        }

        // Check for peaks in the middle of the array
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("position of peak element : " + i);
                return;
            }
        }

        // If no peak is found
        System.out.println("No peak element found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findPeakElement(arr);
        sc.close();
    }
}
