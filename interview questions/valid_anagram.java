// Input: s = "anagram", t = "nagaram"
// Output: true

import java.util.Scanner;

public class valid_anagram {
    public static boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();

        if (m != n) {
            return false;
        }

        else {
            int count[] = new int[26];

            for (int i = 0; i < m; i++) {
                count[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < n; i++) {
                count[t.charAt(i) - 'a']--;
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string s:");
        String s = sc.nextLine();
        System.out.println("enter string t:");
        String t = sc.nextLine();

        System.out.println(isAnagram(s, t));
    }
}
