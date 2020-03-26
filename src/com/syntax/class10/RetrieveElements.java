package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		
	char[] grades= {'a','b','c','d','e','f'};
	
	for(int i=0; i<grades.length; i++) {
		System.out.print(grades[i]);
	}
	
	System.out.println();
	
	for(char x:grades) {
		System.out.print(x);
	}
	System.out.println();
	
	String[] fruits= {"banna","Kiwi","Apple","Mango"};
	for(String v:fruits) {
		if(v.equals("Apple")) {
			System.out.println(v + " is your favorite fruit");
		} else {
			System.out.print(v);
		}
		
	}
	System.out.println();
	
	for(int i=0; i<fruits.length; i++) {
		System.out.print(fruits[i]);
	}
	
	
	}}
