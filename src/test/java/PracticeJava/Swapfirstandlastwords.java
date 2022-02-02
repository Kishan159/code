package PracticeJava;

public class Swapfirstandlastwords {
	
	public static void main(String[] args) {
 
	String s="welcome to Tyss comp";
	String[] str=s.split(" ");
	String temp =str[0];
	str[0]=str[str.length-1];
	str[str.length-1]=temp;
	
	for(int i=0;i<str.length; i++)
	{
		System.out.println(str[i] + " ");
	   }
	}
}
