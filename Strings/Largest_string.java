import java.util.Scanner;

public class Largest_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        String[] fruits = new String[n];

        for (int i = 0; i < n; i++) {
            fruits[i] = sc.next();
        }

        String largest = fruits[0];
        for (int i = 0; i < n; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println(largest);

    }
}
