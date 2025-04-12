// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

package strings;

import java.util.Scanner;

public class index_firstOccurence_string {
    public static int firstoccurence(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter haystack:");
        String haystack = sc.nextLine();
        System.out.println("enter needle:");
        String needle = sc.nextLine();

        int result = firstoccurence(haystack, needle);
        System.out.println("first occurence of needle: " + result);

    }
}
