package com.syntax.class18;

public class Car {

	String make, model, color;
	int year;
	
	public void printDetails() {
		System.out.println("I have "+year+" "+make+" "+model+" in "+color+" color");
	}
	
	public static void main(String[] args) {
		Car car1=new Car();
		//we are using instance variable without assigning any value
		System.out.println(car1.make);
		
		//int door;
		//System.out.println(door); local variables must be initialized
		
		
		
		
	}
}
