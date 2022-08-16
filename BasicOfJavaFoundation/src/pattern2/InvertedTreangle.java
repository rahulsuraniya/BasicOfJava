/*
 * n=4
 * output
 * ****
 * ***
 * **
 * *
 * 
 * example2
 * 4444
 * 333
 * 22
 * 1
 */
package pattern2;
import java.util.Scanner;
public class InvertedTreangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			for(int j=1;j<=n-i+1;j++) {
//				System.out.print("*");	//for first example
				System.out.print(n-i+1);		//for second example
			}
			System.out.println();
			i++;
		}
	}

}
