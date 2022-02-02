package Pj;

public class Reverse2 {

	public static void main(String[] args) {
		String a="Welcome to BDVT";
		String[] b=a.split(" ");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[b.length-1-i]);
			System.out.print(" ");
		}
	}

}
