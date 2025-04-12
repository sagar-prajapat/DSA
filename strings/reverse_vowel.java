// Example 2:

// Input: s = "leetcode"

// Output: "leotcede"

package strings;

import java.util.Scanner;

public class reverse_vowel {
    public static String reverse_vowel(String s) {
        char ch[] = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!isvowel(ch[start])) {
                start++;
            } else if (!isvowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

    public static boolean isvowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||
                ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        System.out.println(reverse_vowel(s));
    }
}
