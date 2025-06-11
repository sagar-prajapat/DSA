// Input: ransomNote = "a", magazine = "b"
// Output: false

// Input: ransomNote = "aa", magazine = "aab"
// Output: true

import java.util.Scanner;

public class ransome_note {
    public static boolean ransome_note(String ransomeNote, String magazine) {
        int count[] = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomeNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ransomeNote:");
        String ransomeNote = sc.nextLine();
        System.out.println("enter magazine:");
        String magazine = sc.nextLine();

        System.out.println(ransome_note(ransomeNote, magazine));
    }
}
