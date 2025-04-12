// Example 1:

// Input: s = "leetcode"

// Output: 0

// Explanation:

// The character 'l' at index 0 is the first character that does not occur at any other index.

package strings;

import java.util.Scanner;

public class first_unique_char {
    public static int first_unique_char(String str) {
        int freq[] = new int[26];
        char chars[] = str.toCharArray();

        for (char c : chars) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String str = sc.nextLine();

        int result = first_unique_char(str);
        System.out.println("first unique character :" + result);
    }
}
