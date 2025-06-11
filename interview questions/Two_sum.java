// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Two_sum {
    public static int[] two_sum(int nums[], int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();
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
        System.out.println("size of array:");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("target:");
        int target = sc.nextInt();

        int result[] = two_sum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
