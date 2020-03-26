package com.syntax.class04;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in); 
	
	System.out.println("how old are you");
	int num1=scan.nextInt(); 
	
	if(num1>=18) {System.out.println("License");}
	else {System.out.println("no license");}

	}

}
