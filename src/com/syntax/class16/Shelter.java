package com.syntax.class16;
 class Shelter {

	public static void main(String[] args) {
		// access instance variables
		Dog puppy=new Dog();
		puppy.name="Charly";
		
		//access static variables of diffrent class
		System.out.println(Dog.breed);

	}

}
