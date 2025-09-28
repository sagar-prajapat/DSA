package Array;

public class Merge_two_array {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9};
		int arr3[] = new int[arr1.length+arr2.length];
		int k=0;
		
		for(int i=0;i<arr3.length;i++) {
			if(i<arr1.length) {
				arr3[i]=arr1[i];
			}
			else {
				arr3[i]=arr2[k];
				k++;
			}
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
	}

}
