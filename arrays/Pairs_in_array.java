package arrays;

import java.util.Scanner;

public class Pairs_in_array {
    public static void Pairs(int arr[]) {
        int totalpairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs : " + totalpairs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Pairs(arr);
    }
}
