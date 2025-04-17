// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]

package strings;

import java.util.Scanner;

public class remove_element {
    public static int remove_element(int nums[], int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        System.out.println("enter val:");
        int val = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("element of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = remove_element(nums, val);

        System.out.println("array after remove val:");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
