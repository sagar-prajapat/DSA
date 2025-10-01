package Array;

public class Arrays_are_identical {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int arr1[] = {1,2,3,6,5};
		
		if(arr.length==arr1.length) {
			boolean flag = true;
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==arr1[i]) {
					flag=true;
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println("identical");
			}
			else {
				System.out.println("Not identical");
			}
		}
	}

}
