package functions_and_methods;

import java.util.Scanner;

public class Bin_to_Dec {
    public static void Bin_to_Dec(int binNum) {
        int mynum = binNum;
        int decNum = 0;
        int pow = 0;

        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of binary number  :" + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary number :");
        int binNum = sc.nextInt();
        Bin_to_Dec(binNum);
    }
}
