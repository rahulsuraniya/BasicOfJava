/*
 * n=4
 *    1
 *   232
 *  34543
 * 4567654
 */
package pattern2;
import java.util.Scanner;
public class IsolesNumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			for(int spc=1;spc<=n-i;spc++) {
				System.out.print(" ");
			}
			int number=i;
			for(int num=1;num<=i;num++) {
				System.out.print(number);
				number++;
			}
			number--;
			for(int dec=i-1;dec>=1;dec--) {
				number--;
				System.out.print(number);
			}
			
			i++;
			System.out.println();
		}

	}

}
