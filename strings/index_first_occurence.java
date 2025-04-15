// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

package strings;

import java.util.Scanner;

public class index_first_occurence {
    public static int index_first_occurence(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter haystack:");
        String haystack = sc.nextLine();
        System.out.println("enter needle:");
        String needle = sc.nextLine();

        System.out.println(index_first_occurence(haystack, needle));
    }
}
