package com.syntax.class14;

public class Car {

	// define feature of the car
	String make;
	String model;
	int year;
	String color;
	int speed;
	
	//define behavior 
	
	void drive() {
		System.out.println(make+" can drive");
	}
	
	void accelerate() {
		System.out.println(make+" can accelerate");
	}
	
	void makeNoise() {
		System.out.println(make+ " can make noise");
	}
	void stop() {
		System.out.println(make+" stops");
	}
	
	public static void main(String[] args) {
		Car car1=new Car();
	}
	
}
