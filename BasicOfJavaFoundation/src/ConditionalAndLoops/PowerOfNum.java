package ConditionalAndLoops;
import java.util.Scanner;
public class PowerOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number:");
		int num=sc.nextInt();
		System.out.println("Please enter power of number");
		int pow=sc.nextInt();
		int PowerOfNum=num;
		
		while(pow>1) {
			PowerOfNum*=num;
			pow--;
		}
		System.out.println("power of number is: "+PowerOfNum);

	}

}
