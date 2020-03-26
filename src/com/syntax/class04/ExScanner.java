package com.syntax.class04;

import java.util.Scanner;

public class ExScanner {

	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in); 
	System.out.println("enter your name");
	
	String name=scan.nextLine();
	System.out.println("My name is "+name);
	
	System.out.println("How old are you");
	int age=scan.nextInt(); 
	
	System.out.println("Your name is "+name+" and your age is "+age);
	

	
	
	}
}
