package Arrays;

import java.util.Scanner;

public class sum_diagonalelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of rows:");
        int rows = sc.nextInt();
        System.out.println("number of columns:");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];

        System.out.println("elements of matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int sum = 0;
        System.out.print("sum of diagonal elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i==j){
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
