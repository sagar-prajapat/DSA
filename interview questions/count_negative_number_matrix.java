// Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output: 8
// Explanation: There are 8 negatives number in the matrix.

import java.util.Scanner;

public class count_negative_number_matrix {
    public static int count_negatives(int[][] grid) {
        int totalrow = grid.length;
        int totalcol = grid[0].length;
        int row = 0;
        int col = totalcol - 1;
        int count = 0;

        while (row < totalrow && col >= 0) {
            if (grid[row][col] < 0) {
                col--;
                count = count + totalrow - row;
            } else {
                row++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows:");
        int row = sc.nextInt();
        System.out.println("enter cols:");
        int col = sc.nextInt();
        int grid[][] = new int[row][col];

        System.out.println("enter elements of matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(count_negatives(grid));

    }
}
