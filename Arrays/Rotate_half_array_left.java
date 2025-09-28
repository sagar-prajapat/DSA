package Array;

public class Rotate_half_array_left {

	public static void main(String[] args) {
		int a[] = {3,11,4,12,6};
		
		int mid = a.length/2;
		int temp = a[mid];
		for(int i=mid;i<a.length-1;i++) {
			a[i] =  a[i+1];
		}
		a[a.length-1]=temp;
		
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
