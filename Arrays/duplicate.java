package Arrays;

import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];

        System.out.println("elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("original array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0;i<n;i++){
            boolean isAlreadyprint = false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    isAlreadyprint = true;
                    break;
                }
            }
            if(!isAlreadyprint){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        System.out.print(arr[i]+" ");
                        break;
                    }
                }
            }
        }

    }
}
