package com.syntax.class16;

public class InstanceVariables {

	String name="John"; //instance variable
	
	public static void main(String[] args) {
		
		String name="yunus"; // local variable
		System.out.println(name);
		
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);
		
		obj.name="ali";
		System.out.println(obj.name);
		
		name="Farid";
		System.out.println(name);
	}
}
