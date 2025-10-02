package Array;

import java.util.Scanner;

public class Remove_element_from_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		int b[] = new int[arr.length-1];
		int k=0;
		System.out.println("enter index:");
		int idx = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(i==idx) {
				continue;
			}
			b[k]=arr[i];
			k++;
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
