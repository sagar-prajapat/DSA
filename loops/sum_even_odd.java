package loops;

import java.util.Scanner;

public class sum_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        int sumeven = 0;
        int sumodd = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sumeven = sumeven + i;
            } else {
                sumodd = sumodd + i;
            }
        }
        System.out.println("sumeven: " + sumeven);
        System.out.println("sumodd: " + sumodd);
    }
}
