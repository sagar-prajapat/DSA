
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to search:");
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("element found at index :"+i);
                break;
            }
        }
    }
}
