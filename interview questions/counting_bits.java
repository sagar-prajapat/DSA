// Input: n = 2
// Output: [0,1,1]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10

import java.util.Scanner;

public class counting_bits {
    public static int[] count_bits(int n) {
        int ans[] = new int[n + 1];
        ans[0] = 0;
        for (int i = 0; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            int count_one = countOne(binary);
            ans[i] = count_one;
        }
        return ans;
    }

    public static int countOne(String num) {
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();

        int result[] = count_bits(n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
