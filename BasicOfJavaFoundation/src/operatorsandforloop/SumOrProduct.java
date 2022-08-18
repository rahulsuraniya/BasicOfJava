package operatorsandforloop;
import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your number");
		int n=sc.nextInt();
		System.out.println("Please choose your number 1 or 2 or anyother");
		int c=sc.nextInt();
		
		int sum=0;
		int product=1;
		
		if(c==1) {
			for(int i=1;i<=n;i++) {
				sum+=i;
			}
			System.out.println(sum);
		}
		else if(c==2) {
			for(int i=1;i<=n;i++) {
				product*=i;
			}
			System.out.println("Product is "+product);
		}
		else {
			System.out.println(-1);
		}
		

	}

}
