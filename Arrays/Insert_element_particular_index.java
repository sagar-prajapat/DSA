package Array;

import java.util.Scanner;

public class Insert_element_particular_index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5};
		int b[] = new int[a.length+1];
		System.out.println("enter index to insert: ");
		int index = sc.nextInt();
		System.out.println("enter element to insert: ");
		int element = sc.nextInt();
		
		for(int i=0;i<a.length+1;i++) {
			if(i<index) {
				b[i]=a[i];
			}
			else if(i==index) {
				b[i]=element;
			}
			else {
				b[i] = a[i-1];
			}
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		

	}

}
