import java.util.Scanner;

public class diff_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        int sumE=0;
        int sumO=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]%2==0) {
                sumE=sumE+arr[i];
            }
            else{
                sumO=sumO+arr[i];
            }

        }
        int diff = sumO-sumE;
        System.out.println("diff:"+diff);
    }
}
