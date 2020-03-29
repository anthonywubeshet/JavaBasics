package com.syntax.class14;

import javax.activation.MailcapCommandMap;

public class Phone {

	String brand;
	String verision;
	String color;
	
	void text() {
		System.out.println(brand+" can text");
	}
	void call() {
		System.out.println(brand+ " can call");
	}
	public static void main(String[] args) {
		Phone phone1= new Phone();
		
		phone1.brand="Apple";
		phone1.call();
		phone1.text();
		
		String str="Hello friends";
		str=str.replace("Hello", "Welcome");
		System.out.println(str);
		
	}
}
