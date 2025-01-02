import java.util.Scanner;

public class subarray_with_sum {
    public static void subarray(int arr[],int sum){
        int currsum = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j=i;j< n;j++){
                currsum = 0;
                for(int k=i;k<=j;k++){
                    currsum = currsum + arr[k];
                }
                if(currsum == sum){
                    System.out.println((i+1)+" "+(j+1));
                }
                currsum = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter sum:");
        int sum = sc.nextInt();

        subarray(arr,sum);
    }
}
