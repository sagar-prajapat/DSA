import java.util.Scanner;

public class spiral_matric {
    public static void spiral(int arr[][]){
        int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]+" ");
        }

        for(int i=startrow+1;i<=endrow;i++){
            System.out.print(arr[i][endcol]+" ");
        }

        for(int j=endcol-1;j>=startcol;j--){
            if(startrow==endrow){
                break;
            }
            System.out.print(arr[endrow][j]+" ");
        }   

        for(int i=endrow-1;i>=startrow+1;i--){
            if(startcol==endcol){
                break;
            }
            System.out.print(arr[i][startcol]+" ");
        }
        startrow++;
        endrow--;
        startcol++;
        endcol--;
    }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows:");
        int r = sc.nextInt();
        System.out.println("enter number of columns:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("elements of matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        spiral(arr);
    }
}
