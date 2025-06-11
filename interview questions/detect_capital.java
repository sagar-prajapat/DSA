// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

// Example 1:
// Input: word = "USA"
// Output: true

// Example 2:
// Input: word = "FlaG"
// Output: false

import java.util.Scanner;

public class detect_capital {
    public static boolean detect_capital(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        }
        if (word.equals(word.toLowerCase())) {
            return true;
        }
        if (Character.isUpperCase(word.charAt(0)) && word.substring(1)
                .equals(word.substring(1).toLowerCase())) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String word = sc.nextLine();

        System.out.println(detect_capital(word));
    }
}
