package Arrays;

import java.util.Scanner;

public class shift_left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;

        System.out.println("array after left shift:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
