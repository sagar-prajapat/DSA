
//sort array consisting onlu 0,1,2 without using sorting algorithm
//time complexity : o(n)

import java.util.Scanner;

public class Sort_consist_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int k = 0;
        for (int i = 0; i < count0; i++) {
            arr[k++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            arr[k++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            arr[k++] = 2;
        }

        System.out.println("sorted array :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
