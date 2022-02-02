package PracticeJava;

public class SwappingOfTwoNumbersUsingThirdVariable {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		int temp;
		System.out.println("Before Swapping a & b values are :"+  a  +"        "+  b);

		//Logic to swap using 3rd variable temp
		
		temp = a;		//10
      	a=b;			       //a=10 ---> a=20
		b = temp;      //b=20 ---> b=10
		
	System.out.println("After Swapping a & b values are :"+  a  +"        "+  b);
	}

	}
	
