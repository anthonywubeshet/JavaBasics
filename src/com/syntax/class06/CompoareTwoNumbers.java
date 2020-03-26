package com.syntax.class06;

import java.util.Scanner;

public class CompoareTwoNumbers {
	public static void main(String [] args) {
		Scanner scan;
		scan=new Scanner(System.in); 
		
		System.out.println("Please enter 3 distinct numbers");
		int num1=scan.nextInt(); 
		int num2=scan.nextInt();
		int num3=scan.nextInt(); 
        int bigNumb=0;
		
		if(num1>num2){
		if(num1>num3) {bigNumb=num1;}}
		else if(num3>num1) {bigNumb=num3;}
		
		if(num2>num1) {
		if(num2>num3) {bigNumb=num2;}}
		
		System.out.println("The largest number is "+ bigNumb);
		
	   
		
		}
	}
