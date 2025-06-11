// Input: nums = [1,1,0,1,1,1]
// Output: 3

// Input: nums = [1,0,1,1,0,1]
// Output: 2

import java.util.Scanner;

public class max_consecutive_ones {
    public static int max_consecutive_ones(int nums[]) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(max_consecutive_ones(nums));
    }
}
