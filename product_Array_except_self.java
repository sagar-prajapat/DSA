// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

package strings;

import java.util.Arrays;
import java.util.Scanner;

public class product_Array_except_self {
    public static int[] product_Array_except_self(int nums[]) {
        int n = nums.length;
        int ans[] = new int[n];
        int proL = 1;
        int proR = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = proR;
            proR = proR * nums[i];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = ans[i] * proL;
            proL = proL * nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(product_Array_except_self(nums)))4;
    }
}
