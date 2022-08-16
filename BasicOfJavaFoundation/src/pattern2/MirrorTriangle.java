/*/
 * n=4
 *    *
 *   **
 *  ***
 * **** 
 */
package pattern2;
import java.util.Scanner;
public class MirrorTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			for(int spc=1;spc<=n-i;spc++) {
				System.out.print(" ");
			}
			for(int str=1;str<=i;str++) {
				System.out.print("*");
			}
			System.out.println();
			i++;
		}

	}

}
