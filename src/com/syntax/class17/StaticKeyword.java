package com.syntax.class17;

public class StaticKeyword {

	//create a template for a phone
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	//return type, name, parameters
	static void displayGeneralInfo() {
		System.out.println("We are building "+brand+" with touch screen="+touchScreen);
	}
	void displaySpecifications() {
		System.out.println("We build phone with "+memory+"GB memory in "+color+" color");
	}
	
	public static void main(String[] args) {
		
		brand="iphone";
		touchScreen=true;
		
		StaticKeyword obj=new StaticKeyword();
		obj.color="grey";
		obj.memory=64;
		
		displayGeneralInfo();
		obj.displaySpecifications();
		
	
		
	}
}
