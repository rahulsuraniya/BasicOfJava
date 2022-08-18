package operatorsandforloop;
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int base=1;
		int dec_value=0;
		int temp=n;
		
		while(temp>0) {
			int last_digit=temp%10;
			temp=temp/10;
			dec_value=dec_value+last_digit*base;
			base=base*2;
		}
		System.out.println("Binary number to decimal to is: "+dec_value);
		

	}

}
