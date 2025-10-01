package Array;

public class Array_is_palindrome {

	public static void main(String[] args) {
		int arr[] = {1,2,3,2,1};
		int start = 0;
		int end = arr.length-1;
		boolean flag = false;
		while(start<end) {
			if(arr[start]!=arr[end]) {
				flag=false;
				break;
			}
			start++;
			end--;
			
		}
		if(flag==true) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
