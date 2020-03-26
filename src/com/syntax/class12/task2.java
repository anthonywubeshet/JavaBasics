package com.syntax.class12;

public class task2 {

	public static void main(String[] args) {
		
		String today="Today is my favorite Java class";
		
		today=today.replace(" ", "");
		System.out.println(today);
		
		String today2="today is my favorite java class 123456 *&^%$";
		
		today2=today2.replaceAll("[a-z0-9]", "").trim();
		System.out.println(today2);
		
		int special=today2.length();
		System.out.println(special);
		
		String today4="Today is my favorite Java class";
		String[] array1=today4.split("my");
		
		System.out.println(array1.length);
		
		
		String a="Is it saturday? Is it raining? Do we have Java Class today?";
		String[] array=a.split("y?");
		System.out.println(array.length);
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
