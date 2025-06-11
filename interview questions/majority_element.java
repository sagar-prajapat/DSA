// Input: nums = [3,2,3]
// Output: 3

import java.util.Scanner;

public class majority_element {
    public static int majority_element(int nums[]) {
        int count = 0;
        int cand = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                cand = nums[i];
            }
            if (cand == nums[i]) {
                count++;
            }
            count--;
        }
        return cand;
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

        System.out.println(majority_element(nums));
    }
}
