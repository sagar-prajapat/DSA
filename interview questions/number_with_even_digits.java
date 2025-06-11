// Input: nums = [12,345,2,6,7896]
// Output: 2

import java.util.Scanner;

public class number_with_even_digits {
    public static int even_digit(int nums[]) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int numsdigit = 0;
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                numsdigit++;
            }
            if (numsdigit % 2 == 0) {
                count++;
            }
        }
        return count;
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

        System.out.println(even_digit(nums));
    }
}
