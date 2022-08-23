package string;
import java.util.Scanner;

public class ReverseString {
	
//	public static String reverseString(String str) {
//		String newStr="";
//		for(int i=str.length()-1;i>=0;i--) {
//			newStr +=str.charAt(i);
//		}
//		return newStr;
//	}
	
	public static String reverseString(String str) {
		String newStr="";
		for(int i=0;i<str.length();i++) {
			newStr=str.charAt(i)+newStr;
		}
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(reverseString(str));
	}

}
