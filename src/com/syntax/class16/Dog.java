package com.syntax.class16;

public class Dog {

	String name, size;
	int age;
	
	static String breed="Husky";
	static int paws=4;
	static int tail=1;
	static int eyes=2;
	
	
	void displayDog() {
		System.out.println("Dog name is "+name+" and it "+size+" dog and age is "+age);
		System.out.println("Dogs breed is "+breed+" and it has "+paws+" paws and "+tail+" tail");
	}
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.name="Lucy";
		dog1.size="Big";
		dog1.age=5;
		dog1.displayDog();
		
		Dog dog2=new Dog();
		dog2.name="Shrek";
		dog2.size="small";
		dog2.age=2;
		dog2.displayDog();
		
		Dog dog3=new Dog();
		dog3.name="Pepsi";
		dog3.size="Big";
		dog3.age=10;
		dog3.displayDog();
		
		System.out.println(Dog.breed);
		
		
		
		
	}
}
