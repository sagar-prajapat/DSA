package Array;

public class Rotate_array_right {

	public static void main(String[] args) {
		int a[] = {2,3,8,6};
		int temp = a[a.length-1];
		
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;

		for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
	}

}
