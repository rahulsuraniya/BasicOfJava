package operatorsandforloop;
import java.util.Scanner;
public class NthfabonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1, b=1, c;
		
		System.out.print(a+" "+b+" ");
		
		for(int i=1;i<n-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println(b);

	}

}
