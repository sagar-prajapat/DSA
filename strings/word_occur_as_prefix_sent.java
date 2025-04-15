// Input: sentence = "i love eating burger", searchWord = "burg"
// Output: 4
// Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
// Example 2:

// Input: sentence = "this problem is an easy problem", searchWord = "pro"
// Output: 2
// Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.

package strings;

import java.util.Scanner;

public class word_occur_as_prefix_sent {
    public static int checkPrefix(String sentence, String searchword) {
        String sentences[] = sentence.split(" ");

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].startsWith(searchword)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence:");
        String sentence = sc.nextLine();
        System.out.println("enter search word:");
        String searchWord = sc.nextLine();

        System.out.println(checkPrefix(sentence, searchWord));
    }
}
