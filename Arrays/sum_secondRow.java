package Arrays;

import java.util.Scanner;

public class sum_secondRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows:");
        int rows = sc.nextInt();
        System.out.println("enter columns:");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i==1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("sum of second row is "+sum);
    }
}
