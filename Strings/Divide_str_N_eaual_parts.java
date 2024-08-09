import java.util.Scanner;

public class Divide_str_N_eaual_parts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the number of parts");
        int n = sc.nextInt();
        int len = str.length();

        int chars = len / n;
        int temp = 0;
        String equalstr[] = new String[n];

        if (len % n != 0) {
            System.out.println("string can't be divided into " + n + " equal parts");
        }

        else {
            for (int i = 0; i < len; i = i + chars) {
                String parts = str.substring(i, i + chars);
                equalstr[temp] = parts;
                temp++;
            }
            System.out.println(n + " equals parts of given string :");
            for (int i = 0; i < equalstr.length; i++) {
                System.out.println(equalstr[i]);
            }
        }

    }
}
