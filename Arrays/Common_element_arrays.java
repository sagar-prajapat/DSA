package Array;

public class Common_element_arrays {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,50};
		int arr2[] = {30,50};
		
		for(int i=0;i<arr1.length;i++) {
			boolean flag = false;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					flag=true;
				}
			}
			if(flag) {
				System.out.println(arr1[i]);
			}
		}
	}

}
