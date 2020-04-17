package com.syntax.class25;

public interface Drivable {
	//compiler by defualt adds public static final
	public static final boolean MOVE_FAST=true; 
	
	//compiler by defualt adds public abstract 
	public abstract void drive();
	
}

abstract class Vehicles{
	abstract void stop();
}
//achieving multiple inheritance 
class Cars extends Vehicles implements Drivable{

	@Override
	public void drive() {
		System.out.println("Car drives");
	}

	@Override
	void stop() {
		System.out.println("Car stops");
	}
}