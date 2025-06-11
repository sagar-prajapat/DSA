// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"

import java.util.Scanner;

public class reverse_word_in_string {
    public static String reverse_word(String s) {
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= words.length - 2; i++) {
            String reverseword = reverseEachWord(words[i]);
            sb.append(reverseword + " ");
        }
        String lastword = reverseEachWord(words[words.length - 1]);
        sb.append(lastword);

        return sb.toString();
    }

    public static String reverseEachWord(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result = result + word.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String s = sc.nextLine();

        System.out.println(reverse_word(s));
    }
}
