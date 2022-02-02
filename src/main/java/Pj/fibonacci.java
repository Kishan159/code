package Pj;

public class fibonacci {

	public static void main(String[] args) {
		int num=6;
		int a=0;
		int b=1;
		
		System.out.println(a+ " ");
		System.out.println(b+ " ");
		 
		for (int i=1;i<=num;i++)
		{
			int c=a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
	}

}
