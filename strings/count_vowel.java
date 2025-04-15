// Input: words = ["are","amy","u"], left = 0, right = 2
// Output: 2
// Explanation: 
// - "are" is a vowel string because it starts with 'a' and ends with 'e'.
// - "amy" is not a vowel string because it does not end with a vowel.
// - "u" is a vowel string because it starts with 'u' and ends with 'u'.
// The number of vowel strings in the mentioned range is 2.

package strings;

import java.util.Scanner;

public class count_vowel {
    public static int countVowelStrings(String[] words, int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            int s = words[i].charAt(0);
            int e = words[i].charAt(words[i].length() - 1);

            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                if (e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter left:");
        int left = sc.nextInt();
        System.out.println("enter right:");
        int right = sc.nextInt();
        String[] words = { "are", "amy", "u" };
        System.out.println(countVowelStrings(words, left, right));
    }
}
