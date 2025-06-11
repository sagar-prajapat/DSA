// Input: s = "A man, a plan, a canal: Panama"
// Output: true

import java.util.Scanner;

public class valid_palindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        String result = sb.toString();
        result = result.toLowerCase();
        if (checkPalindrome(result)) {
            return true;
        }
        return false;
    }

    public static boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));
    }
}
