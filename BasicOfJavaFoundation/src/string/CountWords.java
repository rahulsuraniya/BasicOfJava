package string;
import java.util.Scanner;
public class CountWords {
	
	public static int countWords(String str) {
		if(str.length()<1)
			return 0;
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				count++;
		}
		return count+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("There are total "+countWords(str)+" words");

	}

}
