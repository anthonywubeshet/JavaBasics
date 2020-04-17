package com.syntax.class24;

public abstract class Vechile {
	
	static int totalVechiles;
	String color;
	
	Vechile(String color){
		this.color=color;
		totalVechiles++;
	}
	
	public static void total() {
		System.out.println("we build "+totalVechiles);
	}
	
	public void drive() {
		System.out.println("Vechile drives");
	}

	public void stop() {
		System.out.println("Vechile stops");
	}
	
	public abstract void statrt();
	
	public abstract void brake();
	
	//can abstract method be static? NO
	//public static void m1();
	
	//can abstract method be final? NO
	//public abstract final void m2();
	
	//can abstract method be private? NO
	//private abstract void m3();
}

abstract class Car extends Vechile{
	
	String carType;
	
	Car(String color,String carType){
		super(color);
		this.carType=carType;
	}
	
	public void brake() {
		System.out.println(carType+" have brakes");
	}
	
}

class Tesla extends Car{

	String make;
	
	Tesla(String color, String carType,String make) {
		super(color, carType);
		this.make=make;
	}
	
	public void drive() {
		System.out.println(make+" drives on autopilot");
	}

	@Override
	public void statrt() {
		System.out.println(make+" starts remotely");
		}
	
	public void display() {
		System.out.println("We have "+color+" "+make+" "+carType);
	}
}

class Toyota extends Car{

	String make;
	
	Toyota(String color, String carType,String make) {
		super(color, carType);
		this.make=make;
	}

	@Override
	public void statrt() {
		System.out.println(make+" starts");
		
	}
	
}


