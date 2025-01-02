package Arrays;

import java.util.Scanner;

public class search_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter target :");
        int target = sc.nextInt(); 

        int flag = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("element found at index :"+i);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Element not found in the array.");
        }
    }
}
