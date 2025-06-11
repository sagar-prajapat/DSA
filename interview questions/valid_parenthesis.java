// Input: s = "()"
// Output: true

// Input: s = "()[]{}"
// Output: true

// Input: s = "(]"
// Output: false

// Input: s = "([])"
// Output: true

import java.util.Scanner;

public class valid_parenthesis {
    public static boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else {
                return s.isEmpty();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String s = sc.nextLine();

        System.out.println(isValid(s));
    }
}
