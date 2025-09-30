package Array;

public class Higest_sum_of_two_elemnts {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int sum = arr[0]+arr[1];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]>sum) {
					sum = arr[i]+arr[j];
				}
			}
		}
		System.out.println("highest sum is: "+sum);
	}

}
