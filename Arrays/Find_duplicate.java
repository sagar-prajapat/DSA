package Array;

public class Find_duplicate {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,4,4,5,1,3};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}
	}

}
