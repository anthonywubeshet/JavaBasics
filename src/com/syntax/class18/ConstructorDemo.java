package com.syntax.class18;

public class ConstructorDemo {

	static String str="Hello";
	
	public ConstructorDemo() {
		System.out.println("I am your contructor");
		System.out.println("I am non argument constructor");
	}
	
	ConstructorDemo(String str){
		System.out.println("I am a constructor with 1 String parameter "+str);
	}
	
	ConstructorDemo(int num){
		System.out.println("I am a constructor with 1 integer value "+num);
	}
	
	ConstructorDemo(String str, int num){
		System.out.println("I am a constructor with 2 parameters "+str+"&"+num);
	}
	
	void ConstructorDemo() {
		System.out.println("I do not know who i am");
	}
	
	
	public static void main(String[] args) {
		
		ConstructorDemo obj=new ConstructorDemo("Yes",13);
		System.out.println(str);
		
		ConstructorDemo obj1=new ConstructorDemo();
		obj.ConstructorDemo();
		
	}
}
