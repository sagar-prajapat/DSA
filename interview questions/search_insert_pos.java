// Input: nums = [1,3,5,6], target = 2
// Output: 1

import java.util.Scanner;

public class search_insert_pos {
    public static int search_insert_pos(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("enter target:");
        int target = sc.nextInt();

        System.out.println(search_insert_pos(nums, target));
    }
}
