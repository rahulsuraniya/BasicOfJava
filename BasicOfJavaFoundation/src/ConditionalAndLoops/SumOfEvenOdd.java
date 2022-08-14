package ConditionalAndLoops;
import java.util.Scanner;
public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int num=sc.nextInt();
		int sumE=0;
		int sumO=0;
		
		while(num!=0) {
			int r=num%10;
			if(r%2==0) {
				sumE+=r;
			}
			else {
				sumO+=r;
			}
			num/=10;
		}
		
		System.out.println(sumE+" "+sumO);

	}

}
