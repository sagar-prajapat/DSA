package Arrays;

//reverse using another array

import java.util.Scanner;

public class reverse_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int rev[] = new int[n];

        System.out.println("enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            rev[i]=arr[n-i-1];
        }


        System.out.println("array after reverse:");
        for(int i=0;i<n;i++){
            System.out.print(rev[i]+" ");
        }
    }
}
