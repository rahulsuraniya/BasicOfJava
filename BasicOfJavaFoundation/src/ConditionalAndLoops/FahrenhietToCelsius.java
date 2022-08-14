package ConditionalAndLoops;
import java.util.Scanner;
public class FahrenhietToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int S=sc.nextInt();
		int E=sc.nextInt();
		int W=sc.nextInt();
		int cel;
		
		while(S<=E) {
			cel=((5*(S-32))/9);
			System.out.println(S+" "+cel);
			S+=W;
		}

	}

}
