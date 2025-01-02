package Arrays;

import java.util.Scanner;

public class count_sevens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows of array:");
        int r = sc.nextInt();
        System.out.println("eneter columns of array:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("elements of array :");
        for (int i = 0; i < r; i++) {
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int count=0;
        for(int i=0;i<r;i++){ 
            for(int j=0;j<c;j++){
                if(arr[i][j]==7){
                    count++;
            }
        }
        
    }
    System.out.println("count of 7 in array is "+count);
}
}
