package pattern1;
import java.util.Scanner;
public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your number");
		int num=sc.nextInt();
		int i=1;
		while(i<=num) {
			for(int j=1;j<=num;j++) {
				System.out.print(num);
			}
			System.out.println();
			i++;
		}

	}

}
