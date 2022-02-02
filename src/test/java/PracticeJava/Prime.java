package PracticeJava;

public class Prime {

	public static void main(String[] args) {
		int number=20;
		int factors=0;
		
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				factors++;
			}
		}
		 if(factors==2) {
			 System.out.println(number+" is a prime number");
		 }
		 else {
			 System.out.println(number+"  is not a prime number");
		 }
	}

}
