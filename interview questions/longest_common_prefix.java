// Input: strs = ["flower","flow","flight"]
// Output: "fl"

import java.util.Arrays;
import java.util.Scanner;

public class longest_common_prefix {
    public static String longest_common_prefix(String strs[]) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;

        while (index < str1.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return index == 0 ? "" : str1.substring(0, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();

        String strs[] = new String[n];

        System.out.println("elements of array:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        System.out.println(longest_common_prefix(strs));
    }
}
