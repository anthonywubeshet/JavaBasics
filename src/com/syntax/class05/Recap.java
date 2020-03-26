package com.syntax.class05;
import java.util.Scanner;
public class Recap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.println("enter hieght");
		int height=scan.nextInt(); 
		
		if(height<60) {System.out.println("Short");}
		else if(height>=60 && height<72) {System.out.println("Medium");}
		else if(height>72) {System.out.println("Tall");} 
		
		System.out.println("What day is it");
		int day=scan.nextInt(); 
		
		if(day>=1 && day<=5) {System.out.println("weekday");}
		else if(day>=6 && day<=7) {System.out.println("weekend");}
		else {System.out.println("Invalid day");} 
		
		
		
	
	
	
	}
}
