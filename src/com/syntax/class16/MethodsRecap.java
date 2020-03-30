package com.syntax.class16;

public class MethodsRecap {

	//create a method that will accept array of integers and return max element from that array
	
	int getLargest(int[] array) {
		int largest=array[0];
		
		for(int i=1; i<array.length; i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		return largest;
	}
	
	//create a method that will accept a String and return each word from a given String
	
	String[] getWord(String str) {
		String[] array=str.split(" ");
		
		return array;
	}
	public static void main(String[] args) {
		MethodsRecap obj=new MethodsRecap();
		
		int[] arr= {10,20,56,12};
		obj.getLargest(arr);
		System.out.println(obj.getLargest(arr));
		
		String myString="It is a good world";
		String[] words=obj.getWord(myString);
		
		for(String word:words) {
			System.out.print(word+" ");
		}
	}
}
