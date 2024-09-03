import java.util.Scanner;
import java.util.Arrays;

public class Intersection {
    public static void ArrayIntersection(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n1 = arr2.length;
        int n2 = arr1.length;
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                System.out.println(arr2[j++] + " ");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array :");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("enter arr1 elements :");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter arr2 elements :");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Intersection of two array is :");
        ArrayIntersection(arr1, arr2);
    }
}
