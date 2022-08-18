package operatorsandforloop;

public class PrecedenceandAssociativity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=6;
		int j=8;
		boolean a=i+5>5 && j>6; // for ans we will precedence and associativity
		System.out.println(a);
		
		//associativity
		int c=5*2/8; //thsis expression in same associativity so it will solve left to right
		System.out.println(c);
		
		//precedence example
		int x=10;
		x +=++x-5/3+6*x;
		System.out.println(x);

	}

}
