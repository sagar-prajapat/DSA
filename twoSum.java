// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

package strings;

import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    public static int[] twoSum(int nums[], int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int req_num = target - nums[i];

            if (hm.containsKey(req_num)) {
                int arr[] = { hm.get(req_num), i };
                return arr;
            }
            hm.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("enter target:");
        int target = sc.nextInt();

        System.out.println("elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result[] = twoSum(nums, target);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
