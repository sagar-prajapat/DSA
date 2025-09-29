package Array;

public class Product_of_even_index {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int product = 1;
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				product = product*arr[i];
			}
		}
		System.out.println("product of even index element is: "+product);
	}

}
