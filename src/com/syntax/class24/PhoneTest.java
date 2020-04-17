package com.syntax.class24;

public class PhoneTest {
	
	public static void main(String[] args) {
		
		//new Phone(); CE: cannot instantiate/create an object because ABSTRACT
		
		Phone iphone=new iPhone();
		iphone.call();
		iphone.text();
		iphone.takePic();
		iphone.playMusic();
		
		Phone samsung=new Samsung();
		samsung.call();
		samsung.text();
		samsung.takePic();
		samsung.playMusic();
	}

}
