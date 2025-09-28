package Array;

import java.util.Scanner;

public class Count_matching_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		int arr[] = {10,20,30,20,40,20,20};
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				count++;
			}
		}
		System.out.println(count);

	}

}
