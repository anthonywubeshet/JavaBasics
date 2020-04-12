package com.syntax.class22;

public class AnimalTest {

	public static void main(String[] args) {
		//Non primitive casting: upcasting
		Animal obj=new Tiger();
		obj.sleep();
		obj.eat();
		
		Animal animal=new Animal();
		//method only of parent class will be available 
		animal.eat();
		animal.sleep();
		
		Tiger tiger=new Tiger();
		tiger.sleep();
		tiger.eat();
		tiger.run();

	}

}
