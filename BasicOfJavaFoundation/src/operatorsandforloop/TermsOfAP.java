package operatorsandforloop;
import java.util.Scanner;

/*
 * print the AP form 3N+2 which is not divided by 4
 */

public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        
        for(int i=1;count<n;i++){
            int ap=3*i+2;
            if(ap%4!=0){
                System.out.print(ap+" ");
                count++;

            }
        }


	}

}
