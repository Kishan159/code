package PracticeJava;

public class GenerateFirst5FibonacciNumbers {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int num =5;
		if(num==1) {
			System.out.println(a);
		}
		else 
		{
			System.out.print(a+" "+b+" ");
			for(int i=2; i<num; i++) {
				int c = a+ b;
				a = b;
				a = c ;
				System.out.print(c+" ");
				}
		}
	}

}
