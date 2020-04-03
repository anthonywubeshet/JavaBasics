package com.syntax.class18;

public class Car {

	String make, model, color;
	int year, door, wheels;
	
	public void printDetails() {
		System.out.println("I have "+year+" "+make+" "+model+" in "+color+" color");
	}
	
	public static void main(String[] args) {
		
		Car car=new Car();
		car.make="BMW";
		car.model="m5";
		car.year=2020;
		car.color="Blue";
		car.door=2;
		car.wheels=4;	
		
		car.printDetails();
		
		
		
		
		
		
		Car car1=new Car();
		//we are using instance variable without assigning any value
		System.out.println(car1.make);
		
		//int door;
		//System.out.println(door); local variables must be initialized
		
		
		
		
	}
}
