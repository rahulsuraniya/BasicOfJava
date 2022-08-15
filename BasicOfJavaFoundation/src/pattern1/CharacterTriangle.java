/*
 *n=4
 *A
 *BB
 *CCC
 *DDDD 
 */
 
package pattern1;
import java.util.Scanner;

public class CharacterTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)('A'+i-1));
			}
			System.out.println();
			i++;
		}

	}

}
