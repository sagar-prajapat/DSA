// Example 1:

// Input: s = "egg", t = "add"

// Output: true

// Explanation:

// The strings s and t can be made identical by:

// Mapping 'e' to 'a'.
// Mapping 'g' to 'd'.
// Example 2:

// Input: s = "foo", t = "bar"

// Output: false

// Explanation:

// The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

package strings;

import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic_string {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                if (!hm.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            }

            else {
                if (hm.containsValue(t.charAt(i))) {
                    return false;
                }
                hm.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String s:");
        String s = sc.nextLine();
        System.out.println("enter String t:");
        String t = sc.nextLine();

        System.out.println(isIsomorphic(s, t));
    }
}
