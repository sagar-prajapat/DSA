package Array;

public class product_array_element {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int product=1;
		for(int i=0;i<arr.length;i++) {
			product = product * arr[i];
		}
		System.out.println("product :"+product);
	}

}
