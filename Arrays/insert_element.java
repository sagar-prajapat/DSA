package Arrays;

import java.util.Scanner;

public class insert_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];

        System.out.println("enter element of array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("number you want to input :");
        int num = sc.nextInt();

        System.out.println("enter position :");
        int pos = sc.nextInt();

        for(int i=n-1;i>=pos;i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = num;
        n = n+1;

        System.out.println("final array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
 
    }
}
