import java.util.Scanner;

public class hollow_rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row == 1 || row == 4 || col == 1 || col == 5) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
