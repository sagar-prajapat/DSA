// Input: nums = [1,2,3,1]
// Output: true

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class contains_duplicate {
    public static boolean contains_duplicate(int nums[]) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array:");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(contains_duplicate(nums));
    }
}
