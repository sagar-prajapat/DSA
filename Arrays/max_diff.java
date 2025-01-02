import java.util.Scanner;

public class max_diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max_diff = 0;
        int diff;
        for(int i=0;i<n-1;i++){
            diff=arr[i]-arr[i+1];
            if(diff>max_diff){
                max_diff=diff;
            }
        }
        System.out.println(max_diff);
    }
}
