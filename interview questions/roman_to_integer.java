// Input: s = "III"
// Output: 3
// Explanation: III = 3.

// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.

import java.util.HashMap;
import java.util.Scanner;

public class roman_to_integer {
    public static int roman_to_integer(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int result = hm.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                result = result - hm.get(s.charAt(i));
            } else {
                result = result + hm.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String s = sc.nextLine();

        System.out.println(roman_to_integer(s));
    }
}
