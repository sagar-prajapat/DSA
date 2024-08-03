package functions_and_methods;

import java.util.Scanner;

public class Dec_to_bin {
    public static void Dec_to_bin(int n) {
        int mynum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary of decimal :" + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int n = sc.nextInt();
        Dec_to_bin(n);
    }
}
