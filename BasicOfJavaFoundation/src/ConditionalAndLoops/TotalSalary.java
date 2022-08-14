package ConditionalAndLoops;
import java.util.Scanner;
import java.lang.Math;
public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int basic, allow;
		double hra, da, pf, totalSalary;
		char grade;
		System.out.println("Please enter your basic salary");
		basic=sc.nextInt();
		System.out.println("Please enter your grade");
		grade=sc.next().charAt(0);
		hra=(20*basic)/100.0;
		da=(50*basic)/100.0;
		pf=(11*basic)/100.0;
		
		if(grade=='A') {
			allow=1700;
		}
		else if(grade=='B') {
			allow=1500;
		}
		else {
			allow=1300;
		}
		
		totalSalary=basic+hra+da+allow-pf;
		System.out.println("total salary is: "+totalSalary);
		System.out.println("total salary in round figure: "+Math.round(totalSalary));
	}

}
