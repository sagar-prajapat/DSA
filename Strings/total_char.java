import java.util.Scanner;

public class total_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string :");
        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("total character in string is : " + count);
    }
}
