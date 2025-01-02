import java.util.Scanner;

public class pairs {
    public static void pairs(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("pairs of array:");
        pairs(arr);
    }
}
