package com.syntax.class23;

public class AnimalTest {

	public static void main(String[] args) {
	
		Animal animal=new Bird();
		animal.sleep();
		animal.whoAmI();
		Bird.whoAmI();
		
		Animal.whoAmI();
		Bird.whoAmI();
	}

}
