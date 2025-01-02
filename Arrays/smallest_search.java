package Arrays;

import java.util.Scanner;

public class smallest_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("smallest :"+min);
    }
}
