package Arrays;

import java.util.Scanner;

//Move all negative numbers to beginning and positive to end with constant extra space
// Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
// Output: -12 -13 -5 -7 -3 -6 11 6 5

public class move_negative {
    public static void move(int arr[],int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
            
        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        move(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
