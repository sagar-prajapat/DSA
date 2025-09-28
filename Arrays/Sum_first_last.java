package Array;

import java.util.Scanner;

public class Sum_first_last {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number of array elements:");
		int n = sc.nextInt();
		int arr[] = new int[5];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int sum = arr[0]+arr[arr.length-1];
		
		System.out.println("sum:"+sum);

	}

}
