import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("A grade");
        } else if (marks < 90 && marks >= 70) {
            System.out.println("B grade");
        } else {
            System.out.println("C grade");
        }
    }
}
