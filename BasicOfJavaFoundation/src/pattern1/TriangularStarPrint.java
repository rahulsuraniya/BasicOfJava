package pattern1;
import java.util.Scanner;

public class TriangularStarPrint {

	public static void main(String[] args) {
		// TODO Auto-gene rated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int p=i;
			for(int j=1;j<=i;j++) {
//				System.out.printl("*");
				
//				System.out.print(i);
				
				System.out.print(p); //for print 1 	we taken p=i 
				p--;				// 			 2 1
									//			 3 2 1
									//			 4 3 2 1
				
			}
			System.out.println();
			i++;
		}

	}

}
