package Array;

public class Paires_having_sum_ten {

	public static void main(String[] args) {
		int arr[] = {1,2,4,3,6,5};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==10) {
					System.out.print(arr[i]+"+"+arr[j]+"="+10);
				}
			}
			
		}
	}

}
