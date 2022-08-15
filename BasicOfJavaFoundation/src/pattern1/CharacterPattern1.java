/**
 * 
 * n=4
 * output
 * ABCD
 * ABCD
 * ABCD
 * ABCD
 * 
 * 
 */
package pattern1;
import java.util.Scanner;


public class CharacterPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)('A'+j-1));
			}
			System.out.println();
			i++;
		}

	}

}
