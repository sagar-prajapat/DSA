import java.util.Scanner;

public class binary_search {
    public static int binary_search(int arr[],int target){
            int n = arr.length;
            int start = 0;
            int end = n-1;
    
            while(start<=end){
                int mid = (start+end)/2;
    
                if(arr[mid]==target){
                    return mid;
                }
                if(arr[mid]<target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            return -1;
        } 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size of array:");
            int n = sc.nextInt();
            int[] arr = new int[n];
    
            System.out.println("elements of array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("enter target element:");
            int target = sc.nextInt();
            int result = binary_search(arr, target);
            System.out.println("target found at index:"+result);
    }
}
