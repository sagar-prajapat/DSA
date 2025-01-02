// Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
// Output: 7


// Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
// Output: 10 




import java.util.Arrays;
import java.util.Scanner;

public class kth_smallest {
    public static void kth_smallest(int arr[],int n,int k){
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter k:");
        int k = sc.nextInt();
        kth_smallest(arr, n, k);
    }
}
