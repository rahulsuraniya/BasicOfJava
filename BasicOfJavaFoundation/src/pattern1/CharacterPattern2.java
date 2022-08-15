/*
 *n=4
 *output
 *ABCD
 *BCDE
 *CDEF
 *DEFG 
 */
 
package pattern1;
import java.util.Scanner;
public class CharacterPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int p=i;
			for(int j=1;j<=n;j++) {
				System.out.print((char)('A'+p-1));
				p++;
			}
			System.out.println();
			i++;
		}

	}

}
