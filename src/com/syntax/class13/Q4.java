package com.syntax.class13;

public class Q4 {

	public static void main(String[] args) {
		
		/*
		 * Find out how many alpha characters are present in a String?
		 * Find number of words in string?
		 */

		String str="Fab &^%*";
		str=str.replaceAll("[^A-Za-z]", "");
		int number=str.length();
		System.out.println("Number of alpha character = "+number);
		
		String myString="Today is Monday the";
		String[] array=myString.split(" ");
		int words=array.length;
		System.out.println(words);
	}

}
