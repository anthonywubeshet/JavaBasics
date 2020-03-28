package com.syntax.class14;

public class Dog {

	String breed;
	String color;
	String name;
	int age;
	
	public static void main(String[] args) {
		Dog dog1= new Dog();
		dog1.breed = "Shih tzu";
		dog1.color= "brown";
		dog1.name= "Tim";
		dog1.age= 1;
		
		dog1.bark();
		dog1.run();
		dog1.eat();
		
		Dog dog2= new Dog();
		dog2.breed="Bulldog";
		dog2.color="Black";
		dog2.name="Dock";
		dog2.age=5;
		
		dog2.bark();
		dog2.run();
		dog2.eat();
		
		
	}
	void eat() {
		System.out.println(name+" can eat");
	}
	void bark() {
		System.out.println(name+" can bark");
	}
	void run() {
		System.out.println(name+" can run");
	}
}
