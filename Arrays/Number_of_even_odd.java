package Array;

public class Number_of_even_odd {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int ceven=0;
		int codd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" - even");
				ceven++;
			}
			else {
				System.out.println(arr[i]+" - odd");
				codd++;
			}
		}
		System.out.println("count of even: "+ceven);
		System.out.println("count of odd: "+codd);
	}

}
