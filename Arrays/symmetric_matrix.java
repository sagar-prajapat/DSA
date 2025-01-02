package Arrays;

import java.util.Scanner;

public class symmetric_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows:");
        int row = sc.nextInt();
        System.out.println("enter number of columns:");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int transpose[][] = new int[col][row];
        int flag=1;

        System.out.println("element of matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("transpose matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=arr[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

        if(row==col){
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(arr[i][j]!=transpose[i][j]){
                        flag=0;
                        break;
                    }
                }
                // if(flag==0){
                //     System.out.println("matrix is not symmetric");
                // }
            }
            if(flag==1){
                System.out.println("matrix is symmetric");
            }
            else{
                System.out.println("matrix is not symmetric");
            }
        }
        else{
            System.out.println("matrix is not symmetric");
        }

    }
        
}
