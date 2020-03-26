package com.syntax.class04;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	
	System.out.println("how much do you want to loan");
	int num1=input.nextInt(); 
	
	if(num1<=20000) {System.out.println("lend money");}
	else {System.out.println("dont lend money");}
	
	}

}
