// Example 1:

// Input: s = "ab-cd"
// Output: "dc-ba"

package strings;

import java.util.Scanner;

public class reverse_only_letter {
    public static String reverse(String s) {
        int start = 0;
        int end = s.length() - 1;
        char ch[] = s.toCharArray();

        while (start < end) {
            if (!Character.isLetter(ch[start])) {
                start++;
            } else if (!Character.isLetter(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s:");
        String s = sc.nextLine();

        System.out.println(reverse(s));

    }
}
