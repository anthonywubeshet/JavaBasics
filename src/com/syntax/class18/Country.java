package com.syntax.class18;

public class Country {

	//create variables to hold state and capital of the state
	String state, cap;
	
	//create method to display state and capital
	public void display() {
		System.out.println(state +" and its capital is "+ cap);
	}
	
	//create a Constructor that will initialize instance variables
	public Country(String state,String cap) {
		this.state=state;
		this.cap=cap;
	}
	
	public static void main(String[] args) {
		Country usa=new Country("Virginia","Richmond");
		usa.display();
	
	}
	
	
}
