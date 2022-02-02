package PracticeJava;

public class Uppercase {

	public static void main(String[] args) {
		
		String s="kishore";
		
		for(int i=0;i<s.length();i++)
		{
			if(i==0)
			{
	/*		String s1=" "+s.charAt(i);   //  This is for all uppercase
			System.out.print(s1.toUpperCase());
	*/
			char ch=(char)(s.charAt(i)-32);
			System.out.print(ch);
		}
		else {
			       System.out.print(s.charAt(i));
		}
	}
	}
}
