// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

import java.util.Scanner;

public class first_last_position {
    public static int[] first_last(int nums[], int target) {
        int first = -1;
        int last = -1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[] { first, last };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("enter the target element:");
        int target = sc.nextInt();
        int[] result = first_last(nums, target);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
