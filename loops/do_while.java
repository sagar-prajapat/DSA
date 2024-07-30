package loops;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;

        do {
            System.out.println(count);
            count++;
        } while (count <= 10);
    }
}
