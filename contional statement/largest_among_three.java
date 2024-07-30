import java.util.Scanner;

public class largest_among_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter c : ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greater");
            } else {
                System.out.println(c + " is greater");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is greater");
            } else {
                System.out.println(c + " is greater");
            }
        }
    }
}
