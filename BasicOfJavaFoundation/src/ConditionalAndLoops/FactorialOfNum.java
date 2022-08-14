package ConditionalAndLoops;
import java.util.Scanner;
public class FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int num=sc.nextInt();
		int i=1;
		int fact=1;
		while(num!=0) {
			fact*=num;
			num--;
		}
		System.out.println("factorial is: "+fact);

	}

}
