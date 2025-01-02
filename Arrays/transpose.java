package Arrays;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row:");
        int row = sc.nextInt();
        System.out.println("enter column:");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int transpose[][] = new int[col][row];

        System.out.println("elements of array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[i][j]=arr[j][i];
            }
        }

        System.out.println("original matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("transpose matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
