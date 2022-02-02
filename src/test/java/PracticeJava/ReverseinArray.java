package PracticeJava;

public class ReverseinArray {

	public static void main(String[] args) {
		String s="welcome to bdvt";
		String[] str=s.split(" ");
		
		for(int i=0; i<str.length;i++)
		{ 
			 String temp=str[0];
			 str[0]=str[str.length-1];
			 str[str.length-1]=temp;
			 
			 String rev=" ";
			 for(int j=0;j<=str[i].length()-1;j++)
			 {
				 rev=rev + str[i].charAt(j);
			 }
			 System.out.print(rev +" ");
		}

	}

}
