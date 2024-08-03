package functions_and_methods;

import java.util.Scanner;

public class product_a_b {
    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();

        int product = product(a, b);
        System.out.println("product of a and b is : " + product);
    }
}
