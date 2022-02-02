package PracticeJava;

public class ReverseAStringWithThirdVariableWithoutLengthVariableAndLengthMethod {

	public static void main(String[] args) {
		String str = "My name Kishore";
		char[] ch = str.toCharArray();
		String rev = " ";
		int count=0;
		for(char character :ch) { 
			count++;
		}

		for(int i =count-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
