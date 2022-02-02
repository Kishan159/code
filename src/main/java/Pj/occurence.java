package Pj;

import java.util.LinkedHashSet;

public class occurence {

	public static void main(String[] args) {
	 String str="java class";
	 
	 LinkedHashSet<Character>set = new LinkedHashSet<Character>();
	 for(int i=0;i<str.length();i++) {
		 set.add(str.charAt(i));
	 }
	 for(Character ch : set) {
		 int count=0;
		 for(int i=0;i<str.length();i++)
			 if(ch==str.charAt(i)){
		 {
			 count++;
		 }
	 }
		 if(count>1) {
	 System.out.println(ch +" = " +count);}
	  }
	}
}
