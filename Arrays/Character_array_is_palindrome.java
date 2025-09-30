package Array;

public class Character_array_is_palindrome {

	public static void main(String[] args) {
		char ch[] = {'m','a','l','a','y','a','l','a','m'};
		int i=0;
		int j=ch.length-1;
		boolean flag = true;
		
		while(i<j) {
			if(ch[i]!=ch[j]) {
				flag=false;
				break;
			}
			i++;
			j--;
		}
		if(flag==false) {
			System.out.println("Not palindrome");
		}
		else {
			System.out.println("Palindrome");
		}
		

	}

}
