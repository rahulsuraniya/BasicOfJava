package ConditionalAndLoops;
import java.util.Scanner;

public class LargetstOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
//		if(a>b) {
//			System.out.println("First number is greater");
//		}
//		else {
//			if(b>a) {
//				System.out.println("Second number is greater");
//			}
//			else {
//				System.out.println("Both are equals");
//			}
//		}
		
		
		if(a>b) {
			System.out.println("First number is greater");
		}
		else if(b>a) {
				System.out.println("Second number is greater");
			}
			else {
				System.out.println("Both are equals");
			}
		
		

	}

}
