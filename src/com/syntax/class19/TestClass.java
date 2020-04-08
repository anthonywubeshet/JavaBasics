package com.syntax.class19;

public class TestClass {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.breed="Huskey";
		dog.color="Grey";
		dog.fur="Too much";
		dog.size="Big";
		
		//access method from own class
		dog.bark();
		//access method from parent class
		dog.beWild();
		dog.eat();
		dog.sleep();
		
		Animals animal=new Animals();
		animal.color="Any";
		animal.size="Any";
		animal.fur="Any";
		
		animal.sleep();
		animal.eat();
		animal.beWild();
		
		animal.toString();
		

	}

}
