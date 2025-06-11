// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

import java.util.Scanner;

public class running_sum_array {
    public static int[] runningsum(int nums[]) {
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum = nums[i] + nums[i - 1];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("enter elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result[] = runningsum(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
