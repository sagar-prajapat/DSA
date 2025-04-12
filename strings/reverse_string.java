package strings;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // char arr[] = str.toCharArray();

        // for (int i = str.length() - 1; i >= 0; i--) {
        // System.out.print(arr[i] + " ");
        // }

        // string don't have reverse function so we use StringBuffer
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
