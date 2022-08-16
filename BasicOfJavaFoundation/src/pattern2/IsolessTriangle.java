/*
 *    1
 *   121
 *  12321
 * 1234321
 * 
 * example2
 * n=4
 *    A
 *   BBB
 *  CCCCC
 * DDDDDDD
 */
package pattern2;
import java.util.Scanner;
public class IsolessTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			for(int spc=1;spc<=n-i;spc++) {
				System.out.print(" ");
			}
			for(int num=1;num<=i;num++) {
				System.out.print(num);
//				System.out.print((char)('A'+i-1));
			}
			for(int dec=i-1;dec>=1;dec--) {
				System.out.print(dec);
//				System.out.print((char)('A'+i-1));

			}
			System.out.println();
			i++;
		}
	}

}
