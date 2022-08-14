package pattern1;
import java.util.Scanner;
public class PrintNintoNPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n) {
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
			i++;
		}

	}

}
