package functionandscope;
import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int step=sc.nextInt();
		 int c;
	       while (start<=end)
	        {
				c = (5 * (start-32))/9;
				System.out.println(start+" "+c);
				start=start+step;
			}

	}

}
