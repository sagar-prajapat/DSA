package functions_and_methods;

import java.util.Scanner;

public class Sum_of_digits {
    public static void Sum_of_digits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        Sum_of_digits(n);
    }
}
