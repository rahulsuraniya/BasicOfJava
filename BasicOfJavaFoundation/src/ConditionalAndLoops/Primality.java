package ConditionalAndLoops;
import java.util.Scanner;
public class Primality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		boolean ans=true;
		int div=2;
		while(div<=(num/2)) {
			if(num%div==0) {
				ans=false;
				break;
			}
			div++;
		}
		
		if(ans) {
			System.out.println(num + " is prime");
		}
		else {
			System.out.println(num+" is not prime");
		}

	}

}
