package Array;

import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		int search = sc.nextInt();
		boolean found = false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("element is present");
		}
		else {
			System.out.println("element not present");
		}
	}

}
