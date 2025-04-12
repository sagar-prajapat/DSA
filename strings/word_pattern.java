// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"

// Output: false

package strings;

import java.util.HashMap;
import java.util.Scanner;

public class word_pattern {
    public static boolean word_pattern(String pattern, String s) {
        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> hm = new HashMap<Character, String>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            boolean containskey = hm.containsKey(ch);

            if (hm.containsValue(arr[i]) && !containskey) {
                return false;// Value already mapped to some other key
            }

            if (containskey && !hm.get(ch).equals(arr[i])) {
                return false; // Key already exists but maps to a different value
            }

            if (containskey && hm.get(ch).equals(arr[i])) {
                // Both key and value match — pattern is being followed correctly
                continue;
            }

            // This executes only when key is new and value isn't already used
            hm.put(ch, arr[i]);

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern: ");
        String pattern = sc.nextLine();
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        System.out.println(word_pattern(pattern, s));
    }
}
