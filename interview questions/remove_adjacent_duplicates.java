// Input: s = "abbaca"
// Output: "ca"
// Explanation: 
// For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and 
// this is the only possible move.  The result of this move is that the string is "aaca", of 
// which only "aa" is possible, so the final string is "ca".

import java.util.Scanner;
import java.util.Stack;

public class remove_adjacent_duplicates {
    public static String remove_adjacent_duplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String s = sc.nextLine();

        System.out.println(remove_adjacent_duplicates(s));
    }
}
