package Arrays;

import java.util.Scanner;

public class occurance_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter target:");
        int target = sc.nextInt();

        System.out.println("element of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("original array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("occurrence of element : "+count);
    }
}
