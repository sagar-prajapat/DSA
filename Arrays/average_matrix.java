package Arrays;

import java.util.Scanner;

public class average_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of matrix:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        double average;
        int sum=0;

        System.out.println("elements of matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum = sum + arr[i][j];
            }
        }
        average = sum/n;
        System.out.println("average of matrix is: "+average);

    }
}
