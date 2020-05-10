package com.syntax.class34;

public class Task {

	public static void main(String[] args) {
		// create a method to check age eligibility that will throw a runtime exception. age less than 16
		//create method checkUserName runtime exception. Username less than 5 characters

		//age(15);
		checkUserName("the");
	}
	
	public static void age(int age) {
		
		if(age<16) {
			throw new RuntimeException("Not old enough");
		}
		
	}
	
	public static void checkUserName(String username) {
		if(username.length()<5) {
			throw new RuntimeException("Username too short");
		}
	}

}
