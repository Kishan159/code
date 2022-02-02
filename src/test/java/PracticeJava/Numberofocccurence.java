package PracticeJava;

import java.util.LinkedHashSet;

public class Numberofocccurence {

	public static void main(String[] args) {
		String s = "Java";
		
		//Step: Create any set collection and add all the charecters of given string into set
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)   // 0<4 // 1<4 //2<4 // 3<4
		{
			set.add(s.charAt(i));         //j       //a // v// duplicate a
		}
		{
		System.out.println(set);  //    j a v
		}
		
		for(Character ch:set) {         // set={jav} inside ch
			
			// ch=j, //ch=a
			int count=0;
			
			//Step2:compare each char of set with all the character of the given string
			
			for(int i=0;i<s.length();i++) {    //0<4 // 1<4 // 2<4 // 3<4 // 4<4
				
				if(ch==s.charAt(i)) {    // j==j    // a==j // a==a// a==v// a==a
					
					//step 3: if character matches increase the count
					count++;
				}
				
			}
			System.out.println(ch +" "+count);
		}
	}
}

