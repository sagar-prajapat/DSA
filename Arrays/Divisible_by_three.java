package Array;

public class Divisible_by_three {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
