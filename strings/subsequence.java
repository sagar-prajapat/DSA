// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false

package strings;

import java.util.Scanner;

public class subsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        if (i == s.length()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s:");
        String s = sc.nextLine();
        System.out.println("enter t:");
        String t = sc.nextLine();

        System.out.println(isSubsequence(s, t));
    }
}
