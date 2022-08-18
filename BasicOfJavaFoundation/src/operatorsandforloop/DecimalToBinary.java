package operatorsandforloop;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Plese enter your number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long binary=0;
		long rem,i,flag=1;
		
		for(i=1;n!=0;i=i*10) {
			rem=n%2;
			n=n/2;
			binary +=rem*i;
		}
		System.out.println("Conversion Decimal to Binary :"+binary);

	}

}
