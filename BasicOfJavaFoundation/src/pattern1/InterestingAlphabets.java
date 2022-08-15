/*
 * n=5
 * output
 * E
 * DE
 * CDE
 * BCDE
 * ABCDE
 * */
package pattern1;
import java.util.Scanner;
public class InterestingAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int i=n;
//		
//		while(i>=1) {
//			for(int j=i;j<=n;j++) {
//				System.out.print((char)(j+64));
//			}
//			System.out.println();
//			i--;
//		}
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int currRow=1;
		
		while(currRow<=n) {
			int currCol=1;
			char ch=(char)('A'+n-currRow);
			while(currCol<=currRow) {
				System.out.print((char)(ch+currCol-1));
				currCol++;
			}
			System.out.println();
			currRow++;
		}
		

	}

}
