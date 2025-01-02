package Arrays;

import java.util.Scanner;

public class rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("before rotate:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        System.out.println("array after rotate:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
