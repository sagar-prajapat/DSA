// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]

import java.util.Scanner;

public class merge_sorted_array {
    public static void merge_sorted_array(int nums1[], int m, int nums2[], int n) {
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m");
        int m = sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        int nums1[] = new int[m + n];
        int nums2[] = new int[n];

        System.out.println("elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge_sorted_array(nums1, m, nums2, n);

        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
