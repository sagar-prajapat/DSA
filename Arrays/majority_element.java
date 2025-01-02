package Arrays;
// Majority Element
// Input : arr[] = {1, 1, 2, 1, 3, 5, 1}
// Output : 1
// Explanation: Note that 1 appear 4 times which is more than  7 / 2 times

// Input : arr[] = {3}
// Output : 3
// Explanation: Appears more than n/2 times
m
import java.util.Scanner;

public class majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                System.out.println("majority element is "+arr[i]);
            }
        }
    }
}
