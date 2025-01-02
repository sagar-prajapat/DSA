package Arrays;

import java.util.Scanner;

public class multiply_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row of a:");
        int rowA = sc.nextInt();
        System.out.println("enter column of a:");
        int colA = sc.nextInt();
        System.out.println("enter row of b:");
        int rowB = sc.nextInt();
        System.out.println("enter column of b:");
        int colB = sc.nextInt();
        
        int[][] a = new int[rowA][colA];
        int[][] b = new int[rowB][colB];
        int[][] c = new int[rowA][colB];

        System.out.println("element of a:");
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colA;j++){
                a[i][j] = sc.nextInt();
            }
        }
 
       
        System.out.println("element of b:");
        for(int i=0;i<rowB;i++){
            for(int j=0;j<colB;j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix a:");
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colA;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

 
        System.out.println("matrix b:");
        for(int i=0;i<rowB;i++){
            for(int j=0;j<colB;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("sum of matrix a and b:");
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colB;j++){
                c[i][j] = 0;
                for(int k=0;k<colA;k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
