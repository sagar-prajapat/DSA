import java.util.Scanner;

public class Subsets_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string :");
        String str = sc.nextLine();
        int len = str.length();

        String arr[] = new String[len * (len + 1) / 2];
        int temp = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                arr[temp] = str.substring(i, j + 1);
                temp++;
            }
        }

        System.out.println("subsets of string are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
