// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5

import java.util.Scanner;

public class length_last_word {
    public static int length_last_word(String s) {
        String str = s.trim();
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String:");
        String s = sc.nextLine();

        System.out.println(length_last_word(s));
    }
}
