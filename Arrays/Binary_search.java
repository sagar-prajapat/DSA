package Array;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5,6};
		System.out.println("enter element to search: ");
		int key = sc.nextInt();
		int low=0;
		int high=a.length-1;
		boolean flag = false;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(key==a[mid]) {
				flag = true;
				break;
			}
			else if(key>a[mid]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		if(flag==true) {
			System.out.println("key is present");
		}
		else {
			System.out.println("Key is not present");
		}

	}

}
