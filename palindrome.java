package strings;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String str){
            int n = str.length();
            for(int i=0;i<n/2;i++){
                if(str.charAt(i)!=str.charAt(n-1-i)){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter string:");
            String str = sc.nextLine();
            System.out.println(isPalindrome(str));;
    }
}
