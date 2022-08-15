/*
n=4
A
BC
CDE
DEFG
*/
package pattern1;
import java.util.Scanner;

public class CharPattern2Tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int p=i;
			for(int j=1;j<=i;j++) {
				System.out.print((char)('A'+p-1));
				p++;
			}
			System.out.println();
			i++;
		}


}
}
