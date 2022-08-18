package operatorsandforloop;
import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 System.out.println("Plesee enter size of array");
	        int n=s.nextInt();
		int[] num=new int[n]; 
	    
		System.out.println("Plese enter your array element");
	    for(int i=0;i<n;i++)
	    {
	        num[i]=s.nextInt();
	    }   
	    boolean Ans=true; 
	     for(int j=0;j<n-2;j++) 
	     {
	         if(num[j]==num[j+1])
	         {
	            Ans=false;
	             break;
	         }
	         else if((num[j]<num[j+1])&&(num[j+1]>num[j+2]))
	         {
	          Ans=false;
	             break;
	             
	         }
	     }
	      System.out.print(Ans) ; 

	}

}
