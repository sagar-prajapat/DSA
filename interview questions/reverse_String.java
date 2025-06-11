// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

import java.util.Scanner;

public class reverse_String {
    public static void reverse_String(char s[]) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        char s[] = new char[n];

        System.out.println("enter c_array elements:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().charAt(0);
        }

        reverse_String(s);

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
