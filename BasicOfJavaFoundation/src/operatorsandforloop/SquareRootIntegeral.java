package operatorsandforloop;
import java.util.Scanner;

public class SquareRootIntegeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while((i*i)<=n) {
			if((i*i)>n) {
//				System.out.println(i);
			}
			i++;
		}
		System.out.println(i-1);

	}

}
