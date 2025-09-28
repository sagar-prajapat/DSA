package Array;

public class Product_second_half {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int mid = arr.length/2;
		int product=1;
		for(int i=mid;i<arr.length;i++) {
			product = product*arr[i];
		}
		System.out.println("product: "+product);
	}

}
