// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class jewels_and_stones {
    public static int jewels_and_stones(String jewels, String stones) {
        int count = 0;

        Set<Character> set = new HashSet<>();
        for (char ch : jewels.toCharArray()) {
            set.add(ch);
        }
        for (char ch : stones.toCharArray()) {
            if (set.contains(ch)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter jewels:");
        String jewels = sc.nextLine();
        System.out.println("enter stones:");
        String stones = sc.nextLine();

        System.out.println(jewels_and_stones(jewels, stones));
    }
}
