// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"

package strings;

import java.util.Scanner;

public class Reverse_words_string {
    public static String Reverse_string(String s) {
        String words[] = s.split(" +");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        String result = Reverse_string(s);
        System.out.println("Reversed string: " + result);
    }
}
