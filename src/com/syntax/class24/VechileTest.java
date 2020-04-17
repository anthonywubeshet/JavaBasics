package com.syntax.class24;

public class VechileTest {

	public static void main(String[] args) {
		
		//new Vechile("yellow");
		//new Car("sedan","yellow");
		
		Vechile tesla=new Tesla("yellow", "sedan", "tesla");
		tesla.drive();
		tesla.stop();
		tesla.brake();
		tesla.statrt();
		//tesla.display();CE: method is not defined in Vechile
		
		new Toyota("red", "sedan", "toyota");
		new Toyota("blue", "sedan", "toyota");
		Vechile.total();
	}

}
