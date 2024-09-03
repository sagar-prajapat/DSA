import java.util.Scanner;

public class largest_sum_continuous_subarray {
    public static int largestsum(int arr[]) {
        int maxsum = 0;
        int currsum = 0;

        for (int i = 0; i < arr.length; i++) {
            currsum = currsum + arr[i];

            if (currsum < 0) {
                currsum = 0;
            }

            if (currsum > maxsum) {
                maxsum = currsum;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(largestsum(arr));

    }
}
