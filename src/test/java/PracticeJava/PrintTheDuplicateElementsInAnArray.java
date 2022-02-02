package PracticeJava;

import java.util.LinkedHashSet;

public class PrintTheDuplicateElementsInAnArray {

	public static void main(String[] args) {
			int[] a = {2, 4, 21, 4, 5, 16,4, 2, 3,31,21};
			LinkedHashSet<Integer>  set = new LinkedHashSet<Integer>();
			for(int i =0; i<a.length; i++) {
				set.add(a[i]);
			}
			
			for(Integer n :set) {
				int count =0;
				for(int i =0 ; i<a.length; i++) {
					if(n == a[i]) {
						count++;
					}
				}
				if(count>1) {
				System.out.println(n +" = "+count);
				}
			}
		}
		}

