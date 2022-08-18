package operatorsandforloop;
import java.util.Scanner;
public class BitwiseOperator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a=10;
		int b=2;
		
		int c=a&b; //	10--> 1010
				   // 	2-->  0010
					//  a&b-->0010
		System.out.println(c);
		int d=a|b;
		System.out.println(d);
		
		//XOR ooperation
		int e=a^b;
		System.out.println(e); 	// 8
		
		System.out.println(~a);
		
		int x=10;
		int y=-20;
		System.out.println(x^y);
		
		//left shift operator
		a=10;
		System.out.println(a<<1); // 
		
		//right shift operator
		a=10;
		System.out.println(a>>1);
	}

}
