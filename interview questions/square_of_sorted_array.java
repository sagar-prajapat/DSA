// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]

import java.util.Scanner;

public class square_of_sorted_array {
    public static int[] square_of_sorted_array(int nums[]) {
        int left = 0;
        int right = nums.length - 1;
        int result[] = new int[nums.length];

        for (int i = result.length - 1; i >= 0; i--) {
            int leftsqrt = nums[left] * nums[left];
            int rightsqrt = nums[right] * nums[right];

            if (leftsqrt > rightsqrt) {
                result[i] = leftsqrt;
                left++;
            } else {
                result[i] = rightsqrt;
                right--;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result[] = square_of_sorted_array(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
