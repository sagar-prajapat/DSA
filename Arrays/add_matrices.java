package Arrays;

import java.util.Scanner;

public class add_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row:");
        int row = sc.nextInt();
        System.out.println("enter column:");
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];

        System.out.println("element of a:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j] = sc.nextInt();
            }
        }
 
       
        System.out.println("element of b:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix a:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

 
        System.out.println("matrix b:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("sum of matrix a and b:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
