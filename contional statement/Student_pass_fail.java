import java.util.Scanner;

public class Student_pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student marks :");
        int marks = sc.nextInt();

        if (marks >= 40) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
