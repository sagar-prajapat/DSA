// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true

package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class contain_duplicate {
    public static boolean contain_duplicate(int nums[], int k) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], i);
            } else {
                int pastindex = hm.get(nums[i]);
                if (Math.abs(pastindex - i) <= k) {
                    return true;
                } else {
                    hm.put(nums[i], i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("enter k:");
        int k = sc.nextInt();

        System.out.println("elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(contain_duplicate(nums, k));
    }
}
