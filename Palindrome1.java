// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false

package strings;

import java.util.Scanner;

public class Palindrome1 {
    public static boolean ispalindrome(int x) {
        int temp = x;
        int rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;
        }
        if (rev == temp) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x:");
        int x = sc.nextInt();

        System.out.println(ispalindrome(x));
    }
}
