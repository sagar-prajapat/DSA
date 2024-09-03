import java.util.Scanner;

public class Revise {
    public static void Rearrange(int arr[]) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int k = 0;
        for (int i = 0; i < count0; i++) {
            arr[k] = 0;
            k++;
        }
        for (int i = 0; i < count1; i++) {
            arr[k] = 1;
            k++;
        }
        for (int i = 0; i < count2; i++) {
            arr[k] = 2;
            k++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Rearrange(arr);

        System.out.println("sorted array :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
