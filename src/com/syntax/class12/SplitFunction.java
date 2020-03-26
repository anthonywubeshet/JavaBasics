package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {

		String today="Today is my favorite Java class";
		String[] array=today.split("my");
		
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite Java class";
		String[] stringArray=today.split("a");
		
		for(String arr:stringArray) {
			System.out.print(arr+"|");
		}
		System.out.println();
		
		String today2="Today is my favorite Java class";
		String[] words=today2.split(" ");
		
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		
		String today3="Today is my favorite Java class";
		today3=today3.trim();
		System.out.println(today3);
		
		
		
		
		
		
		
	}

}
