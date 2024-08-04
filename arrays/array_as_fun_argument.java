package arrays;

import java.util.Scanner;

public class array_as_fun_argument {
    public static void update(int marks[], int nonchangable) {
        nonchangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = { 97, 98, 99 };
        int nonchangable = 5;
        update(marks, nonchangable);
        System.out.println("nonchangable = " + nonchangable);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
