package Array;

public class Average_array_elemnt {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			 sum = sum+arr[i];
		}
		
		int average = sum/arr.length;
		System.out.println("Average: "+average);
	}

}
