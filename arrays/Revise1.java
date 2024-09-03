import java.util.Scanner;

public class Revise1 {
    public static void Rearrange(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];

        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println("final array :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Rearrange(arr);

    }
}
