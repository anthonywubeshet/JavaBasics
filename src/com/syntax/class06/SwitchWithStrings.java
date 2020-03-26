package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		/*ask a user where he is from
		 * based on the country we will define favorite food
		 * Your favorite food is____
		 * 
		 */
		Scanner scan;
		String country;
		String favoriteFood;
		
		scan=new Scanner(System.in); 
		System.out.println("Please enter your country");
		country=scan.nextLine(); 
		
		switch(country) {
		
		case "Morocco":
			favoriteFood="couscous";
			break;
		case "Belarus":
			favoriteFood="Potato";
			break;
		case "Tajikistan":
			favoriteFood="Osh";
			break;
		case "Turkey":
			favoriteFood="Baklva";
			break;
		case "Afghanistan":
			favoriteFood="Mantu";
			break;
		case "Kazahstan":
			favoriteFood="Beshparmak";
			break;
		default:
			favoriteFood="Unknown";
		}
		System.out.println("Your favoirte food is "+favoriteFood);

	
	
	}}
