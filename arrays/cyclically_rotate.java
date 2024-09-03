import java.util.Scanner;

public class cyclically_rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;

        System.out.println("rotated array :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
