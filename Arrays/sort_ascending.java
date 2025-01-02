package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sort_ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("array before sorting:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        System.out.println("array after sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
