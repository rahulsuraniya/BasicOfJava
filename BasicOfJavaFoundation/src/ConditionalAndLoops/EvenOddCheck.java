package ConditionalAndLoops;
import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
		

	}

}
