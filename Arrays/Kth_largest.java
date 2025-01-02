import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Kth_largest {
     public static void kth_largest(int arr[],int n,int k){
        Integer newArr[] = new Integer[n];

        for(int i=0;i<n;i++){
            newArr[i]=arr[i];
        }
        Arrays.sort(newArr,Collections.reverseOrder());
       
        System.out.println(newArr[k-1]);
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
        kth_largest(arr, n, k);
    }

    
}
