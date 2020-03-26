package com.syntax.class12;

import java.util.Scanner;

public abstract class Task1 {

	public static void main(String[] args) {
	
		Scanner scan; 
		scan=new Scanner(System.in);
		
		System.out.println("Moms first name?");
		String name1=scan.nextLine();
		System.out.println(name1);
		
		System.out.println("Dads first name?");
		String name2=scan.nextLine();
		System.out.println(name2);
		
		System.out.println("boy or girl?");
		String gender=scan.nextLine();
		
		int num1=name1.length()/2;
		String first=name1.substring(0, num1);
		
		int num2=name2.length();
		int num3=name2.length()/2;
		String second=name2.substring(num3);
		
		String newName=first+second;
		System.out.println(newName);
		
		
		

	}

}
