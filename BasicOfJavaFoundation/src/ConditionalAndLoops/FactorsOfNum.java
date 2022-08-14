package ConditionalAndLoops;
import java.util.Scanner;
public class FactorsOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=2;
		
		while(i>0 && i<num) {
			if(num%i==0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
