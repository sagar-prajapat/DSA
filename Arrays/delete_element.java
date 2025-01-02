package Arrays;

import java.util.Scanner;

public class delete_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter elements of array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("position of number which is to be deleted:");
        int pos = sc.nextInt();

        for(int i=pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n=n-1;

        System.out.println("final array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
