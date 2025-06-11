// Input: x = 121
// Output: true

// Input: x = -121
// Output: false

import java.util.Scanner;

public class palindrome_number {
    public static boolean palindrome_number(int x) {
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
        System.out.println("enter number :");
        int x = sc.nextInt();

        System.out.println(palindrome_number(x));
    }
}
