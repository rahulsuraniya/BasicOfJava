package string;

public class UnderStandingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		String str1="abc";
		String str3="abc";
		String str2=new String("abc");
		
		System.out.println(str==str1);
		System.out.println(str==str3);
		System.out.println(str.contains(str2));
		str=str+"adc";
		System.out.println(str);
		System.out.println(str1);
		boolean ans=false;
		Boolean an=new Boolean("rahul");
		System.out.println(an.equals(str3));

	}

}
