
import java.util.Scanner;

public class array_subset_another {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("size of n:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("size of n1:");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        
        System.out.println("Elements of array1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        boolean issubset=true;
        for(int i=0;i<n1;i++){
            boolean found = false;
            for(int j=0;j<n;j++){
                if(arr1[i]==arr[j]){
                    found=true;
                    break;
                }

            }
            if(!found){
                issubset=false;
                break;
            }
        }
        if (issubset) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
