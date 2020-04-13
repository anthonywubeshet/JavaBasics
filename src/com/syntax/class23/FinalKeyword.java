package com.syntax.class23;

public class FinalKeyword {

	static String str="Hello";
	public static final String str1="Bye";//final variable=Constant 
	
	public static final String appURL="syntaxtechs.com";
	
	final char Grade='A';
	
	
	
	public static void main(String[] args) {
		
		str="Hi";
		//str1="Good bye"; CE:
		//appURL="adasdas";

	}
	
	public final void hello() {
		System.out.println("I am a final method");
	}
	
	public final void hello(String name) {
		System.out.println("Hello "+name);
	}

}

class SubClass extends FinalKeyword{
	
	//public void hello() {CE: cannot override final method
		//}
	
	public void hello(int num) {//not overriding
		System.out.println("Hello of child class");
	}
	
}
