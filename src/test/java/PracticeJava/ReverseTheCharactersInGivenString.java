package PracticeJava;

public class ReverseTheCharactersInGivenString {

	public static void main(String[] args) 
	{
		String str = "Bhagwan Ganesh";
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
    	}
		
	}
	
}
