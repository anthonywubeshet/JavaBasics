package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		
		System.out.println("what are your sales");
		double sales=scan.nextDouble(); 
		double com;
		
		if(sales>=1 && sales<=100) {com= sales*.10;}
		else if(sales>100 && sales<=200) {com= sales*.20;}
		else if(sales>200 && sales<=500) {com= sales*.30;}
		else {com= sales*.50;}
		System.out.println("Your commision is " + com);
		
		if(com>100) {System.out.println("Great seller");}
	}
	

}
