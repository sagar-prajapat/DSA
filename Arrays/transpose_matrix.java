package Arrays;

import java.util.Scanner;

//without using another matrix
public class transpose_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row:");
        int row = sc.nextInt();
        System.out.println("enter column:");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("elements of array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("original matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("transpose matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
