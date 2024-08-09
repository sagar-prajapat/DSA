import java.util.Scanner;

public class separate_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(charArray[i]);
        }
    }
}
