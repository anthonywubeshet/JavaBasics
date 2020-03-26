package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		
		System.out.println("How old are you");
		int age=scan.nextInt();
		
		if(age>0) {
		if(age>=0 && age<=3) {System.out.println("baby");}
		else if(age>=4 && age<=5) {System.out.println("kid");}
		else if(age>=6 && age<=12) {System.out.println("Child");}
		else if(age>=13 && age<=19) {System.out.println("teen");}
		else if(age>=20 && age<65) {System.out.println("adult");}
		else if(age>=65) {System.out.println("senior");}}
		else {System.out.println("Enter valid age");}
	
		
	
	
	
	}}
