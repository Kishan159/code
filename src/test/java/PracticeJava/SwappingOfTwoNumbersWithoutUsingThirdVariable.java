package PracticeJava;

public class SwappingOfTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;

		System.out.println("Before Swapping a & b values are :"+  a  +"        "+  b);

		//Logic to swap without 3rd variable
		a= a+b;	//40
		b=a-b;		//10
		a=a-b;		//30

		System.out.println("After Swapping a & b values are :"+  a  +"        "+  b);
	}

	}

