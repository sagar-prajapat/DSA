package Arrays;

import java.util.Scanner;

public class sort_descending {
    public static int[] sort_descending(int[] arr, int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort_descending(arr,n);

        System.out.println("sorted array in descending order");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
