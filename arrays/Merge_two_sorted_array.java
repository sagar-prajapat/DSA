import java.util.Scanner;

public class Merge_two_sorted_array {

    public static void merge(int arr1[], int arr2[], int n1, int n2) {
        int temp;

        for (int i = 0; i < n1; i++) {
            if (arr1[i] > arr2[0]) {
                temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }

            int j = 0;
            while ((j + 1 < n2) && arr2[j] > arr2[j + 1]) {
                temp = arr2[j];
                arr2[j] = arr2[j + 1];
                arr2[j + 1] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array1 :");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("elements of arr1 :");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("size of array2 :");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        System.out.println("elements of arr2 :");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        merge(arr1, arr2, n1, n2);

        System.out.println("final arrays :");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < n2; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
