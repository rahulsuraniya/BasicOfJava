package string;
import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Given string is: "+isPalindrome(str));

	}

}
