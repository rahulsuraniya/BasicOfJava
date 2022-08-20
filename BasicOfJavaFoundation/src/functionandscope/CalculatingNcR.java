package functionandscope;
import java.util.Scanner;

public class CalculatingNcR {
	
	public static int fact(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of n");
		int n=sc.nextInt();
		System.out.println("Please enter the value of r");
		int r=sc.nextInt();
		
		int factN=fact(n);
		int factR=fact(r);
		int factN_R=fact(n-r);
		
		int result=factN/(factR*factN_R);
		System.out.println("the value of ncr will be: "+result);
		

	}

}
