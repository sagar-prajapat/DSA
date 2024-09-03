import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " is duplicate");
                }
            }
        }

    }
}
