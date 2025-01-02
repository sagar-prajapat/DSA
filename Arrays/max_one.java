package Arrays;

import java.util.Scanner;

//Find the row with maximum number of 1s
// Input matrix : 0 1 1 1
//                0 0 1 1
//                1 1 1 1 
//                0 0 0 0
// Output: 2
// Explanation: Row = 2 has maximum number of 1s, that is 4.

public class max_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row:");
        int row = sc.nextInt();
        System.out.println("enter number of column:");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("elements of matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max=0;
        int max_row=0;
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                max_row=i;
            }
        }
        System.out.println("row with max one is "+max_row);
    }
}
