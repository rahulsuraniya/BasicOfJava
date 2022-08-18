package operatorsandforloop;
import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int reverse=0;
		
		while(n!=0) {
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println("Reverse of a number is: "+reverse);

	}

}
