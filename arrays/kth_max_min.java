import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class kth_max_min {
    public static void Kthsmallest(Integer arr[], int k) {
        Arrays.sort(arr);
        System.out.println("Kth smallest element is " + arr[k - 1]);
    }

    public static void Kthlargest(Integer arr[], int k) {
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Kth smallest element is " + arr[k - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("enter value of k :");
        int k = sc.nextInt();

        System.out.println("elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Kthsmallest(arr, k);
        Kthlargest(arr, k);

    }
}
