package functions_and_methods;

import java.util.Scanner;

public class fun_parameter {
    public static int calculate(int a, int b) { // here a and b are parameters
        int sum = a + b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        int sum = calculate(a, b); // here a and b are arguments
        System.out.println("sum : " + sum);

    }
}
