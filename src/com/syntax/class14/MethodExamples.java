package com.syntax.class14;

public class MethodExamples {

	//want to create a method that will be greeting a person
	
	void greet() {
		System.out.println("Hello Anthony");
	}
	void greet1(String name) {
		System.out.println("Hello "+name);
	}
	public static void main(String[] args) {
		
	MethodExamples o1=new MethodExamples();
	
	o1.greet();
	o1.greet1("tim");
	}
}
