package string;
import java.util.Scanner;

public class PrintAllSubstring {
	
//	public static void printAllSubstring(String str) {
//		int n=str.length();
//		
//		for(int i=0;i<n;i++) {
//			for(int j=i;j<n;j++) {
//				System.out.print(str.subSequence(i, j+1)+" ");
//			}
//			System.out.println();
//		}
//		
//	}
	
	public static void printAllSubstring(String str) {
		for(int len=1;len<=str.length();len++) {
			for(int start=0;start<=str.length()-len;start++) {
				int end=start+len-1;
				System.out.print(str.substring(start, end+1)+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		printAllSubstring(str);
	}

}
