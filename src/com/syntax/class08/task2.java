package com.syntax.class08;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
	Scanner scan;
	scan=new Scanner(System.in); 
	
	 
	int money;
     int price;
     String item;
     
	boolean shop=true;
	do {System.out.println("Enter item");
    item=scan.nextLine();
    System.out.println("Enter price");
    price=scan.nextInt();
    System.out.println("Give money for ");
    money=scan.nextInt();
    int dif=price-money;
    int change=money-price;
    if(money<price) {System.out.println("Pay "+dif);}
    if(money>price) {System.out.println("your change is "+change);}
    System.out.println("Are you done shooping");
    shop=scan.nextBoolean();}while(!shop);
		
		
	
	

	}

}
