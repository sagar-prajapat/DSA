import java.util.Scanner;

public class Substring {
    public static void substring(String str, int si, int ei) {
        for (int i = si; i < ei; i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("enter start index :");
        int si = sc.nextInt();
        System.out.println("enter end index :");
        int ei = sc.nextInt();

        substring(str, si, ei);

    }
}
