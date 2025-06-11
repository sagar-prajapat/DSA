// Input: s = "abcd", t = "abcde"
// Output: "e"

import java.util.Scanner;

public class find_difference {
    public static char find_difference(String s, String t) {
        int sum_s = 0;
        int sum_t = 0;

        for (int i = 0; i < t.length(); i++) {
            sum_t = sum_t + t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            sum_s = sum_s + s.charAt(i);
        }

        return (char) (sum_t - sum_s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s:");
        String s = sc.nextLine();
        System.out.println("enter t:");
        String t = sc.nextLine();

        System.out.println(find_difference(s, t));
    }
}
