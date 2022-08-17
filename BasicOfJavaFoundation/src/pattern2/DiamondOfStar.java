/*
 * n=5
 * 
 *   *
 *  ***
 * *****
 *  ***
 *   *
 *   
 */
package pattern2;
import java.util.Scanner;
public class DiamondOfStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,num,dec;
		i=1;
		while(i<=(n+1)/2 ){
			int spaces=1;
			while(spaces<=(n+1)/2-i) {
				System.out.print(' ');
				spaces=spaces+1;
			}		
			num=1;
			while(num<=i) {
				System.out.print('*');
				num=num+1;
			}
			
			dec=i-1;
			while(dec>=1) {
				System.out.print('*');
				dec=dec-1;
			}
			System.out.println();
			i=i+1;
		}
		
		
//		i=n-((n+1)/2);
		i=n/2;
		while(i>=1) {
			int spaces=1;
			while(spaces<n-i-1) {
				System.out.print(' ');
				spaces=spaces+1;
			}		
			num=1;
			while(num<=i) {
				System.out.print('*');
				num=num+1;
			}
			
			dec=i-1;
			while(dec>=1) {
				System.out.print('*');
				dec=dec-1;
			}
			System.out.println();
			i=i-1;
		}


			


	}

}
