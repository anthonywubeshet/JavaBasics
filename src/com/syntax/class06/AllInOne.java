package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		
		Scanner scan;
		String sale;
		double price = 0;
		double discount = 0; 
		double finalPrice = 0;
		
		scan=new Scanner(System.in); 
		System.out.println("Is there sale");
		sale=scan.nextLine();
		
		if(sale.equals("Yes")) {System.out.println("what is the price");
		price=scan.nextDouble();
		if(price<=20) {discount=price*.01;
		finalPrice=price-discount;}
		else if(price>20 && price<=100) {discount=price*.02;
		finalPrice=price-discount;}
		else if(price>100 && price<=500) {discount=price*.03;
		finalPrice=price-discount;}
		else {discount=price*.05;
		finalPrice=price-discount;}
		System.out.println("After "+discount+" discount the price of the item reduced from "
				+ price+" to "+ finalPrice);}
		else {System.out.println("No shopping today");}
	
	
	
	
	
	}}