import java.util.Scanner;

public class diagonal_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row:");
        int r = sc.nextInt();
        System.out.println("enter number of column:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int sum=0;
        for(int i=0;i<r;i++){
            sum=sum+arr[i][i];

            if(i!=r-1-i){
                sum=sum+arr[i][r-1-i];
            }
        }
        System.out.println("sum of diagonal element is "+sum);


    }
}
