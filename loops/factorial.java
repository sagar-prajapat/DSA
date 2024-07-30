package loops;

import java.util.Scanner;

public class factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        int fact;
        fact = factorial(n);

        System.out.println("factorial of " + n + " is " + fact);
    }
}
