// Input: s = "RLRRLLRLRL"
// Output: 4

// Input: s = "LLLLRRRR"
// Output: 1

import java.util.Scanner;

public class split_string_in_balance_string {
    public static int split_string(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int left = 0, right = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'L') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                count++;
            }
        }
        return count++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String s = sc.nextLine();

        System.out.println(split_string(s));
    }
}
