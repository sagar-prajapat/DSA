package Array;

public class Print_arrays_zigzag {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {10,20,30,40,50};
		int c[] = new int[a.length+b.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<c.length) {
			if(j<a.length) {
				c[i] = a[j];
				i++;
				j++;
			}
			if(k<b.length) {
				c[i] = b[k];
				i++;
				k++;
			}
		}
		for(int d=0;d<c.length;d++) {
			System.out.print(c[d]+" ");
		}
	}

}
