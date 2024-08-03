package functions_and_methods;

import java.util.Scanner;

public class Average_threenum {
    public static void average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println("average: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        System.out.println("enter c :");
        int c = sc.nextInt();
        average(a, b, c);
    }
}
