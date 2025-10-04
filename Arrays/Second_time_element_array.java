package Array;

import java.util.Scanner;

public class Second_time_element_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,2,5,2};
		System.out.println("enter number: ");
		int n = sc.nextInt();
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				count++;
			}
		}
		if(count>=2) {
			System.out.println(n+" is present multiple times");
		}
		else {
			System.out.println(n+" not present multiple times");
		}
	}

}
