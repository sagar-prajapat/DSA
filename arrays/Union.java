import java.util.Scanner;

public class Union {
    public static void Arrayunion(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) { // when i is small
                System.out.println(arr1[i++] + " ");
            } else if (arr2[j] < arr1[i]) { // when j is small
                System.out.println(arr2[j++] + " ");
            } else {
                System.out.println(arr2[j++]); // when both are equal
                i++;
            }
        }

        while (i < n1) {
            System.out.println(arr1[i++]);
        }
        while (j < n2) {
            System.out.println(arr2[j++]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array :");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("enter elements of arr1 :");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter elements of arr2 :");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("union of array is :");
        Arrayunion(arr1, arr2);
    }
}
