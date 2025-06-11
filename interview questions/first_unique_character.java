// Input: s = "leetcode"
// Output: 0

import java.util.Scanner;

public class first_unique_character {
    public static int first_unique_character(String s) {
        int freq[] = new int[26];
        char chars[] = s.toCharArray();

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
        String s = sc.nextLine();

        System.out.println(first_unique_character(s));
    }
}
