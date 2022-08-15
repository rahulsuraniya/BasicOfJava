package pattern1;
import java.util.Scanner;

public class TriangularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your number");
		int num=sc.nextInt();
		int i=1;
		int p=1;
		while(i<=num) {
			for(int j=1;j<=i;j++) {
				System.out.print(p);
				p++;
			}
			
			System.out.println();
			i++;
			
			//remove p=i line for print 
			//1
			//2 3
			//4 5 6
			//7 8 9 10
//			p=i;	//for 1
					//	  2 3
					//    3 4 5
					//    4 5 6 7
		}

	}

}
