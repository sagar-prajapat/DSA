package Array;

public class Multiple_of_five {

	public static void main(String[] args) {
		int arr[] = {5,10,15,22,45,36};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
