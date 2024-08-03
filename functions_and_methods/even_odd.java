package functions_and_methods;

import java.util.Scanner;

public class even_odd {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean result = isEven(num);
        System.out.println(result);
    }
}
