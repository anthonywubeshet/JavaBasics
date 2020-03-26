package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		
		String str1="Welcome Syntax Students";
		String str2="Welcome Syntax students";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String expected="Home - Syntax Technologies"; 
		String actual="  Home - Syntax Technologies ";
		
		if(actual.equals(expected)) {
			System.out.println("Test case pass. Titles matched");
		}else {
			System.out.println("Test case fails. Titles are NOT matched");
		}
		
		if(actual.trim().equals(expected)) {
			System.out.println("Test case pass. Titles matched");
		}else {
			System.out.println("Test case fails. Titles are NOT matched");
		}
		
		String browser="Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Test excuted on chrome browser");
		}
		
		if(browser.toLowerCase().equals("chrome")) {
			System.out.println("Test excuted on chrome browser");
		}
		
	}

}
