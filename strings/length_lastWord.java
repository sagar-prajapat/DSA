package strings;

import java.util.Scanner;

public class length_lastWord {
    public static int length_lastWord(String str) {
        String s = str.trim();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int result = length_lastWord(str);
        System.out.println("Length of last word: " + result);
    }
}
