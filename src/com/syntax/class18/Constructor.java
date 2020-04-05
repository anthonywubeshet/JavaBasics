package com.syntax.class18;

public class Constructor {

	public Constructor() {
		System.out.println("Public constructor");
	}
	Constructor(int num){
		System.out.println("Defualt");
	}
	protected Constructor(int num, int num1) {
		System.out.println("protected");
	}
	private Constructor(String str) {
		System.out.println("private");
	}
	
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		Constructor obj1=new Constructor(12);
		Constructor obj2=new Constructor(13,14);
		Constructor obj3=new Constructor("hi");
	}
}
