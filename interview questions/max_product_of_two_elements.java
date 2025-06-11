// Input: nums = [3,4,5,2]
// Output: 12 
// Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, 
// that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12

import java.util.Arrays;
import java.util.Scanner;

public class max_product_of_two_elements {
    public static int max_product_of_two_elements(int nums[]) {
        Arrays.sort(nums);
        int firstmax = nums[nums.length - 1];
        int secondmax = nums[nums.length - 2];
        int result = (firstmax - 1) * (secondmax - 1);
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

        System.out.println(max_product_of_two_elements(nums));
    }
}
