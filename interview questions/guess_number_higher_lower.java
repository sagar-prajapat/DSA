// -1: Your guess is higher than the number I picked (i.e. num > pick).
// 1: Your guess is lower than the number I picked (i.e. num < pick).
// 0: your guess is equal to the number I picked (i.e. num == pick).
// Return the number that I picked.

// Example 1:

// Input: n = 10, pick = 6
// Output: 6

import java.util.Scanner;

public class guess_number_higher_lower {
    public static int guessNumber(int n, int pick) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int result = guess(n, pick);
            if (result == 0) {
                return mid;
            } else if (result == 1) {
                start = mid + 1;
            } else {
                end = end - 1;
            }
        }
        return -1;
    }

    public static int guess(int num, int pick) {
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        System.out.println("enter pick:");
        int pick = sc.nextInt();

        int result = guessNumber(n, pick);
        System.out.println(result);
    }
}
