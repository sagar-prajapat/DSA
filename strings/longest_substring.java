//SLIDING WINDOW TECHNIQUE IS USED
// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.

package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class longest_substring {
    public static int longest_substring(String s) {
        int start = 0;
        int end = 0;
        int max_length = 0;

        List<Character> list = new ArrayList<Character>();

        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String s = sc.nextLine();

        int result = longest_substring(s);
        System.out.println("longest substring without repeating characters is: " + result);
    }
}
