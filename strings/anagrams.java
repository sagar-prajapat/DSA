package strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static boolean anagram(String str, String str2) {
        if (str.length() != str2.length()) {
            return false;
        } else {
            char[] arr = str.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr);
            Arrays.sort(arr2);

            if (Arrays.equals(arr, arr2)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string1: ");
        String str = sc.nextLine();

        System.out.println("Enter a string2: ");
        String str2 = sc.nextLine();

        boolean result = anagram(str, str2);

        if (result) {
            System.out.println("The strings are anagrams of each other.");
        } else {
            System.out.println("The strings are not anagrams of each other.");
        }

    }
}
