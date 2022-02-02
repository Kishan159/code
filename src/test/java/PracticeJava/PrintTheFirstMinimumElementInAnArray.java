package PracticeJava;

public class PrintTheFirstMinimumElementInAnArray {

	public static void main(String[] args) {
		int [] arr = {20,30,10,50,40};
		//swap the elements in Ascending Order
		for(int i =0; i< arr.length; i++) {
			for(int j =i; j< arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//first minimum element
		System.out.print("The first minimum element in an array is :"+arr[0]);
	}

	}
