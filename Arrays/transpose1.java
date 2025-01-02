package Arrays;

import java.util.Scanner;

public class transpose1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("elements of matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of the matrix:");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }


    }
}
