package loops;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();

        while (n > 10) {
            System.out.println("number is greater than 10");
            break;
        }
    }
}
