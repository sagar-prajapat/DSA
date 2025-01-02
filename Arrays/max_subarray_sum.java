import java.util.Scanner;

public class max_subarray_sum {
    public static void maxSubArraySum(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("Maximum contiguous sum is :" + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxSubArraySum(arr);
    }
}

