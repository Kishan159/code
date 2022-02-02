package PracticeJava;

public class Palindrome {

	public static void main(String[] args) {
		int num=169;
		int temp=num;
		int rev=0;
		
		while(num>0) {
			int dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
			if(rev==temp) {
			 System.out.println(temp+" is a palindrome");
			}
			 else 
			 {
				 System.out.println(" "+" is not a palindrome");
			 }
			}
		}


