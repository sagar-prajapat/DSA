package Arrays;

//Sort an array of 0s, 1s and 2s – Dutch National Flag Problem
// Input: arr[] = {0, 1, 2, 0, 1, 2}
// Output: {0, 0, 1, 1, 2, 2}
// Explanation: {0, 0, 1, 1, 2, 2} has all 0s first, then all 1s and all 2s in last.


import java.util.Scanner;

public class sort_array {
    public static void sort012(int arr[],int n){
        int c0=0,c1=0,c2=0;

        
        for(int i=0;i<n;i++){
            //count 0s
            if(arr[i]==0){
                c0++;
            }
            //count 1s
            else if(arr[i]==1){
                c1++;
            }
            //count 2s
            else{
                c2++;
            }
        }

        int idx=0;
        //place all 0s
        for(int i=0;i<c0;i++){
            arr[idx]=0;
            idx++;
        }

        //place all 1s
        for(int i=0;i<c1;i++){
            arr[idx]=1;
            idx++;
        }

        //place all 2s
        for(int i=0;i<c2;i++){
            arr[idx]=2;
            idx++;
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
        sort012(arr, n);

        System.out.println("sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
