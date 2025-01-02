import java.util.Scanner;

public class max_product_subarray {
    public static void max_subarray(int arr[]){
        int maxProduct = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int product = 1;
            for(int j=i;j<arr.length;j++){
                product = product * arr[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        System.out.println("maximum subarray product:"+maxProduct);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        max_subarray(arr);
    }
}
