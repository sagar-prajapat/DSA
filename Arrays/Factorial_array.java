package Array;

public class Factorial_array {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int fact = 1;
		
		for(int i=0;i<arr.length;i++) {
			fact = fact*arr[i];
		}
		
		System.out.println("factorial of array is: "+fact);

	}

}
