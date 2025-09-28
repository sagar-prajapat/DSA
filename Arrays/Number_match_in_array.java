package Array;

import java.util.Scanner;

public class Number_match_in_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		int arr[] = {1,2,3,4,5};
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Matched");
		}
		else {
			System.out.println("Not Matched");
		}
	}

}
