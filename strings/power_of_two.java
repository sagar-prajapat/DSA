// Example 1:

// Input: n = 1
// Output: true
// Explanation: 20 = 1
// Example 2:

// Input: n = 16
// Output: true
// Explanation: 24 = 16

package strings;

import java.util.Scanner;

public class power_of_two {
    public static boolean isPowerofTwo(int n) {
        if (n == 0) {
            return false;
        }

        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            } else {
                n = n / 2;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();

        System.out.println(isPowerofTwo(n));
    }
}
